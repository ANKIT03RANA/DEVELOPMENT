package com.devspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// System.out.println("Hello World");
		Alien obj= context.getBean(Alien.class);
		// Alien obj1= context.getBean(Alien.class);
		// System.out.println(obj==obj1);
		obj.code();
	}

}
