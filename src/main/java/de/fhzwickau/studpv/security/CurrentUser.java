package de.fhzwickau.studpv.security;

import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

 private User user;
 
 public CurrentUser(User user) {
	super(user.getEmail(), user.getPasswordHash(),
	AuthorityUtils.createAuthorityList(user.getRole().toString()));
	this.user = user;
 }

 public User getUser() {
	 return user;
 }

 public Long getId() {
	 return user.getId();
 }

 public String getNickname() {return user.getNickname();}

 public ROLE getRole() {
	 return user.getRole();
 }
}