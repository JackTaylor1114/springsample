package de.fhzwickau.studpv.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.fhzwickau.studpv.common.InitializeDB;

@Controller
public class LoginController {
	
	InitializeDB initializeService;
	
	@RequestMapping("/login")
	public String getFirstPage(Model model) {	
		return "login";
	}
}
