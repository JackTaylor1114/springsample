package de.fhzwickau.studpv.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	User findByNickname(String nickname);
	 
}