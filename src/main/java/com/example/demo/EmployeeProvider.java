package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeProvider implements EmployeeService {
	ArrayList<Employees> emp = new ArrayList<Employees>();

	@Override
	public List<Employees> getEmployees() {
		Employees e = new Employees();
		e.setId(100);
		e.setName("Abc");
		e.setSalary(40000.5);
		emp.add(e);

		Employees e2 = new Employees();
		e2.setId(99);
		e2.setName("Xyx");
		e2.setSalary(4000.5);
		emp.add(e2);

		Employees e3 = new Employees();
		e3.setId(800);
		e3.setName("pqr");
		e3.setSalary(50000);
		emp.add(e3);

		Employees e4 = new Employees();
		e4.setId(55);
		e4.setName("mno");
		e4.setSalary(100000);
		emp.add(e4);

		Employees e5 = new Employees();
		e5.setId(555);
		e5.setName("ijk");
		e5.setSalary(55000.500);
		emp.add(e5);

		Employees e6 = new Employees();
		e6.setId(56);
		e6.setName("ijk");
		e6.setSalary(55000.500);
		emp.add(e6);
		return emp;
	}
}