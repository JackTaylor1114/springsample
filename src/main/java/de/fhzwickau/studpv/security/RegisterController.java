package de.fhzwickau.studpv.security;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/register")
	public String register(Model model) {	
		UserDTO userDTO = new UserDTO();
		model.addAttribute("user",userDTO);
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") @Valid UserDTO userDTO) {	
		User user = new User();
		user.setEmail(userDTO.getEmail());
		user.setNickname(userDTO.getNickname());
		user.setPasswordHash(userDTO.getPasswordHash());
		user.setRole(ROLE.USER);
		userRepository.save(user);
		return "login";
	}
}