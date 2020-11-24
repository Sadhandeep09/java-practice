package com.perito.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayListPractice {
	static ArrayList<Employee> l = new ArrayList<>();
	static List<Employee> l1 = new ArrayList<>();
	static List<Employee> l2 = new ArrayList<>();

	public static void addStrings() {
		List<String> l = new ArrayList<>();

		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = "abcd";
		String s4 = "abcd";
		String s5 = "abcd";

		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);

		l.forEach(s -> System.out.println(s));
	}

	public static void addEmployee() {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Hari");
		e1.setRole("dev");
		e1.setSalary(2000000);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Nataraz");
		e2.setRole("dev");
		e2.setSalary(2000000);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("Sreenu");
		e3.setRole("dev");
		e3.setSalary(2000000);

		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("Durga");
		e4.setRole("dev");
		e4.setSalary(2000000);

		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("Ratan");
		e5.setRole("dev");
		e5.setSalary(2000000);

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);

	}

	public static void addObjFromListToList() {

		/*
		 * for (int i = 0; i < l.size(); i++) { l1.add(l.get(i)); }
		 */

		for (Employee employee : l) {
			l1.add(employee);
		}

	}

	public static void main(String[] args) {
		// addStrings();

		addEmployee();
		// l.forEach(e -> System.out.println(e));

		System.out.println(l);
		// System.out.println(l.stream().count());
		// System.out.println(l.stream().findFirst());
		// l.stream().forEach(e -> System.out.println(e));
		// l.stream().filter(e ->
		// e.getName().startsWith("h")).forEach(System.out::println);;

		/*
		 * addObjFromListToList(); l1.forEach(e -> System.out.println(e));
		 */

		/*
		 * Collections.shuffle(l); System.out.println("After shuffle::"+l);
		 */

		/*
		 * Collections.reverse(l); System.out.println("After reverse::"+l);
		 */

		// System.out.println(l.subList(0, 4));

		// join l to l1
		/*
		 * l1.addAll(l); System.out.println(l1);
		 */

		// compare 2 AL
		/*
		 * for (Employee e : l) {
		 * 
		 * if (l1.contains(e)) { System.out.println(e); }
		 * 
		 * }
		 */

		// swap 2 elements
		/*
		 * Collections.swap(l, 0, 4); System.out.println("After swap::"+l);
		 */

		// empty the AL

		/*
		 * l.removeAll(l); System.out.println("After remove all::" + l);
		 */

		// System.out.println(l.isEmpty());

		// System.out.println(l.size());

		/*
		 * l.trimToSize(); System.out.println(l);
		 */

		//increasing capacity
		/*
		 * l.ensureCapacity(10); System.out.println(l);
		 */
		
		//replace element
		/*
		 * Employee e6 = new Employee(); e6.setId(6); e6.setName("Replace");
		 * e6.setRole("dev"); e6.setSalary(2000000); l.set(0, e6);
		 * System.out.println(l);
		 */
		
		//printing elements based on index
		/*
		 * for (int i = 0; i < l.size(); i++) { System.out.println(l.get(i)); }
		 */
		

	}

}
