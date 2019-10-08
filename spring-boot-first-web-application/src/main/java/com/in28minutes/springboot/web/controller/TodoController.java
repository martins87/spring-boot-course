package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.service.LoginService;
import com.in28minutes.springboot.web.service.TodoService;

@Controller
public class TodoController {
	
	/**
	 * This is a component that is a dependency
	 * It needs to be injected automatically, so no need to instantiate it
	 * We do this with @Autowired
	 */
	@Autowired
	TodoService todoService;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.put("todos", todoService.retrieveTodos("in28minutes"));
		
		return "list-todos";
	}
	
}
