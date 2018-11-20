package com.bala.springboot.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bala.springboot.web.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;
	//@GetMapping("/login")
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		//model.put("name", name);
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String sayWelcome(ModelMap model,@RequestParam String name,@RequestParam String password) {
		
		boolean isUserValid=service.validateUser(name, password);
		if(!isUserValid) {
			model.put("message", "Invalid Crediantiols");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
	
	

}
