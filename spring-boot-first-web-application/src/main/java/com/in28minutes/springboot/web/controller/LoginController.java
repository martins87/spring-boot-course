package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@ResponseBody
	public String loginMessage(ModelMap model) {
		// makes the model available to the view page
		// model.put("name", name);
		
		return "login";
	}
	
	// here the value refers to the URL, like localhost:8080/login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		
		// welcome is the jsp returned
		return "welcome";
	}
	
}
