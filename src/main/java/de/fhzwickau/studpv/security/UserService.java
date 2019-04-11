package de.fhzwickau.studpv.security;


import java.util.Collection;
import java.util.Optional;

public interface UserService {
	UserDTO getUserById(long id);
	Optional<User> getUserByEmail(String email);
	boolean existsByNickname(String nickname);
 	boolean existsByEmail(String email);
 	Collection<UserDTO> getAllUsers();
 	User create(UserCreateForm form);
} 