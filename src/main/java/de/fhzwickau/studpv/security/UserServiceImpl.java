package de.fhzwickau.studpv.security;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	Optional<User> users;

	@Override
	public UserDTO getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		return Optional.of(userRepository.findByEmail(email));
	}

	@Override
	public boolean existsByNickname(String nickname) {
		return false;
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(UserCreateForm form) {
		// TODO Auto-generated method stub
		return null;
	}

}
