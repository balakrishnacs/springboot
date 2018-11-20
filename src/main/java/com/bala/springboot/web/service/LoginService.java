package com.bala.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String name,String passord)
	{
		return name.equalsIgnoreCase("bala") && passord.equalsIgnoreCase("123456");
	}

}
