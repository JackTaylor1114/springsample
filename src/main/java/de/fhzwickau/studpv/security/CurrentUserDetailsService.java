package de.fhzwickau.studpv.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserDetailsService implements UserDetailsService {

	private UserService userService;

	@Autowired
	public CurrentUserDetailsService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public CurrentUser loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userService.getUserByEmail(email).orElseThrow(() ->
		new UsernameNotFoundException("User with email= " + email + " cannot be not found"));
		return new CurrentUser(user);
	}
} 