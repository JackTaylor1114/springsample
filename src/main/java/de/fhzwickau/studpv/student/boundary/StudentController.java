package de.fhzwickau.studpv.student.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import de.fhzwickau.studpv.student.service.InitializeService;

@Controller
public class StudentController {
	
	InitializeService initializeService;
	
	@Autowired
	public StudentController(InitializeService initializeService) {
		this.initializeService = initializeService;
	}
	
	@RequestMapping("/start")
	public String getFirstPage(Model model) {		
		model.addAttribute("listAllStuds", initializeService.init());
		return "stud";
	}
}
