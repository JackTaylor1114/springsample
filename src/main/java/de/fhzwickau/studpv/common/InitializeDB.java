package de.fhzwickau.studpv.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.fhzwickau.studpv.lv.domain.LV;
import de.fhzwickau.studpv.lv.domain.LVRepository;
import de.fhzwickau.studpv.student.domain.Student;
import de.fhzwickau.studpv.student.domain.StudentRepository;

@Component
public class InitializeDB {
	
	StudentRepository studentRepository;
	
	LVRepository LvRepository;
	
	@Autowired
	public InitializeDB(StudentRepository studentRepository, LVRepository LvRepository) {
		this.studentRepository = studentRepository;
		this.LvRepository = LvRepository;
	}

	@PostConstruct //Ausführen nach Anlegen
	@Transactional
	public List<Student> init() {
		Student student = new Student("test");
		Student student2 = new Student("test2");
		
		System.out.println("ID: " + student.getId());
		
		studentRepository.save(student);
		studentRepository.save(student2);
		
		LV modellierung = new LV("modellierung");
		LV middleware = new LV("middleware");
		
		student2.addLvs(middleware);
		student2.addLvs(modellierung);
		
		LvRepository.save(modellierung);
		LvRepository.save(middleware);
		studentRepository.save(student2);
		
		System.out.println("ID: " + student.getId());
		
		List<Student> listAllStudents = new ArrayList<>();
		
		listAllStudents.add(student);
		listAllStudents.add(student2);
		
		return listAllStudents;
	}

}
