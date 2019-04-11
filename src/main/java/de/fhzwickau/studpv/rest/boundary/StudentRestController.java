package de.fhzwickau.studpv.rest.boundary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhzwickau.studpv.student.domain.Student;
import de.fhzwickau.studpv.student.service.StudService;

@RestController
@RequestMapping("/stud")
public class StudentRestController {
	
	@Autowired
	private StudService studService;
	
	
	public StudentRestController(StudService studService) {
		super();
		this.studService = studService;
	}

	@RequestMapping(value = "/students", method = {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<?> getStudent() {
		List<Student> lStudents = studService.getStudents();
		return ResponseEntity.status(HttpStatus.OK).body(lStudents);
	}
	
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		studService.addStudent(student);
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}

}
