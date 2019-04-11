package de.fhzwickau.studpv.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.fhzwickau.studpv.student.domain.Student;
import de.fhzwickau.studpv.student.domain.StudentRepository;

@Service
public class StudService {
	
	private StudentRepository studentRepository;

	@Autowired
	public StudService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getStudents () {
		return studentRepository.findAll();
	}

	public void addStudent(Student student) {
		this.studentRepository.save(student);
		
	}

}
