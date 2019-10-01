package com.in28minutes.springboot.web.service;

public class LoginService {
	
	public boolean validateUser(String userId, String password) {
		// valid combination: in28minutes, dummy
		return userId.equalsIgnoreCase("in28minutes")
				&& password.equalsIgnoreCase("dummy");
	}

}
