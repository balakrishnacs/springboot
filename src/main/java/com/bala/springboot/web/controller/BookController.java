package com.bala.springboot.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	/*
	 * 
	 * New Code Added
	 * 
	 * 
	 */
	@GetMapping("/books")
	public List<Book> getBooks(){
		
		return Arrays.asList(new Book(1, ".net", "Hello World"));
		
	}

}
