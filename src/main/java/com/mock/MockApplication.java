package com.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MockApplication {
	static DataProvider dp;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MockApplication.class, args);
		DataService s = context.getBean(DataService.class);
		// s.setSearchKey(55);
		System.out.println(s.searchData());
	}

}
