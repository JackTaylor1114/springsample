package de.fhzwickau.studpv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2-console/**").antMatchers("/console/**");
        web.ignoring().antMatchers("/register");
    }
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/login/**")
		.permitAll()
		.antMatchers("/users/m**")
		.hasAuthority("ADMIN")
		.antMatchers("/users/c**")
		.hasAuthority("ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin() 
		//.loginPage("/login")  
		.defaultSuccessUrl("/start", true)  
		.failureUrl("/login?error")   
		.usernameParameter("email")  
		.permitAll()  
		.and()  
		.logout()  
		.invalidateHttpSession(true)  
		.deleteCookies("JSESSIONID")   
		.logoutUrl("/logout")  
		.logoutSuccessUrl("/") 
		.permitAll()   
		.and()  
        .rememberMe();     
	}     
 
 	@Override
 	public void configure(AuthenticationManagerBuilder auth) throws Exception {
 		auth
 		.userDetailsService(userDetailsService)
 		.passwordEncoder(new BCryptPasswordEncoder());
 	} 
}