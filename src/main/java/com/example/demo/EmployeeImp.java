package com.example.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeImp {
	@Autowired
	private EmployeeService e;
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	Comparator<Employees> searchComp = new Comparator<Employees>() {
		@Override
		public int compare(Employees e1, Employees e2) {
			return Integer.compare(e1.getId(), e2.getId());
		}
	};
	Comparator<Employees> sortComp = new Comparator<Employees>() {
		@Override
		public int compare(Employees o1, Employees o2) {
			if (o1.getId() < o2.getId()) {
				return -1;
			} else if (o1.getId() > o2.getId()) {
				return 1;
			} else {
				return 0;
			}
		}
	};
	public Employees searchEmployee() {
		List<Employees> emp = e.getEmployees();
		Employees search = new Employees();
		search.setId(id);
		Collections.sort(emp, sortComp);
		int res = Collections.binarySearch(emp, search, searchComp);
		if (res < 0)
			return null;
		return emp.get(res);
	}

}