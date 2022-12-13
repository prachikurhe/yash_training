package com.security.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//		
//		  auth.inMemoryAuthentication().withUser("prachi").password("password").roles(
//		  "ADMIN").and().withUser("xyz") .password("xyz").roles("USER");
//		 

	auth.userDetailsService(userDetailsService);
	
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.httpBasic().and().authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/user/**")
//				.hasAnyRole("ADMIN", "USER").antMatchers("/hello/**").permitAll().and()
////		.csrf().disable()
//				.formLogin();
//
//	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();

	}
}
