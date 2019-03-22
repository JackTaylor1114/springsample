package de.fhzwickau.studpv.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.fhzwickau.studpv.student.domain.Student;

@Service
public class InitializeService {
	
	public List<Student> init() {
		Student student = new Student("test",3);
		Student student2 = new Student("test2",4);
		
		List<Student> listAllStudents = new ArrayList<>();
		
		listAllStudents.add(student);
		listAllStudents.add(student2);
		
		return listAllStudents;
	}

}
