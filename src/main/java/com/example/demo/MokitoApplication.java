package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MokitoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MokitoApplication.class, args);
		EmployeeImp o = context.getBean(EmployeeImp.class);
		o.setId(55);
		Employees e = o.searchEmployee();
		System.out.println(e);
	}

}
