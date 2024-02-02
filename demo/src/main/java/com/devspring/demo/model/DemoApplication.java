package com.devspring.demo.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.devspring.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// System.out.println("Hello World");
		// Alien obj= context.getBean(Alien.class); //Inversion of Control i.e. we are letting springboot to create object for us.
		// Alien obj1= context.getBean(Alien.class);
		// System.out.println(obj==obj1);
		// obj.code();
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
