package de.fhzwickau.studpv.student.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.fhzwickau.studpv.common.InitializeDB;

@Controller
public class StudentController {
	
	InitializeDB initializeService;
	
	@Autowired
	public StudentController(InitializeDB initializeService) {
		this.initializeService = initializeService;
	}
	
	@RequestMapping("/start")
	public String getFirstPage(Model model) {		
		model.addAttribute("listAllStuds", initializeService.init());
		return "stud";
	}
}
