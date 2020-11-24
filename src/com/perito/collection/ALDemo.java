package com.perito.collection;

import java.util.ArrayList;
import java.util.List;

public class ALDemo {
	List<Employee> l1 = new ArrayList();
	List<String> l2 = new ArrayList();

	public void add() {
		List<Employee> l1 = new ArrayList();
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Abhi");
		emp.setRole("dev");
		emp.setSalary(2000000);

		Employee emp1 = new Employee();
		emp1.setId(102);
		emp1.setName("Abhinav");
		emp1.setRole("dev");
		emp1.setSalary(2000000);

		Employee emp2 = new Employee();
		emp2.setId(103);
		emp2.setName("Abhiraj");
		emp2.setRole("dev");
		emp2.setSalary(2000000);

		l1.add(emp);
		l1.add(emp1);
		l1.add(emp2);

		// System.out.println(l1);
		for (Employee e : l1) {
			System.out.println(e);
		}
	}

	public void addString() {
		l2.add("abc");
		l2.add("def");
		l2.add("ghi");

		System.out.println(l2);
	}

	public static void main(String[] args) {
		ALDemo al = new ALDemo();
		al.add();
		// al.addString();

	}

}
