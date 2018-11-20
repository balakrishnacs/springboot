package com.bala.springboot.web.springbootfirstwebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.bala.springboot.web.*"})
public class SpringbootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstWebApplication.class, args);
	}
}
