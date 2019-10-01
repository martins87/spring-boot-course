package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

/**
 * This is a Spring Bean
 * @Component creates an instance of it, without the need to instantiate the class
 * (e.g. new LoginService())
 */
@Component
public class LoginService {
	
	public boolean validateUser(String userId, String password) {
		// valid combination: in28minutes, dummy
		return userId.equalsIgnoreCase("in28minutes")
				&& password.equalsIgnoreCase("dummy");
	}

}
