package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
public class LoginController {
	
	/**
	 * This is a component that is a dependency
	 * It needs to be injected automatically, so no need to instantiate it
	 * We do this with @Autowired
	 */
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@ResponseBody
	public String loginMessage(ModelMap model) {
		// makes the model available to the view page
		// model.put("name", name);
		
		return "login";
	}
	
	// here the value refers to the URL, like localhost:8080/login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		boolean isValidUser = loginService.validateUser(name, password);
		
		if(isValidUser) {
			model.put("name", name);
			model.put("password", password);
			
			return "welcome";
		} else {
			return "namekusei";
		}
	}
	
}
