package com.perito.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	
	static  HashSet<Employee> hs = new HashSet<Employee>();
	public static void addEmployee()	{
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
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
	
		
	}
	
	
	public static void main(String[] args) {
		addEmployee();
		
		//append eement in last
		/*
		 * Employee e6 = new Employee(); e6.setId(6); e6.setName("Tata");
		 * e6.setRole("dev"); e6.setSalary(2000000);
		 * 
		 * Employee e7 = new Employee(); e7.setId(7); e7.setName("Birla");
		 * e7.setRole("dev"); e7.setSalary(2000000);
		 * 
		 * hs.add(e6); hs.add(e7);
		 */

		//retrieve from hs
		/*
		 * for (Employee e : hs) { System.out.println(e); }
		 */
		
		//get the no of element in hs
	//	System.out.println(hs.size());

		//empty an hs
		/*
		 * hs.removeAll(hs); System.out.println(hs);
		 */
	
	//	System.out.println(hs.isEmpty());
		
		//cloning
		/*
		 * HashSet hs1 = (HashSet) hs.clone(); System.out.println(hs1);
		 */
	
		//converting hs to array
		/*
		 * hs.toArray(); System.out.println(hs);
		 */
		
		//converting hs to tree set
		
		/*
		 * Set<Employee> ts = new TreeSet<Employee>(hs); for(Employee e : ts){
		 * System.out.println(e); }
		 */
		
		//converting hs to list
		/*
		 * List l = new ArrayList<Employee>(hs); System.out.println(l);
		 */
	
		//compare two hs
		/*
		 * HashSet<Employee> hs1 = new HashSet<Employee>(); hs1.addAll(hs);
		 * System.out.println(hs1); for (Employee employee : hs) {
		 * if(hs1.contains(employee)) { System.out.println(employee); } }
		 */
		
		//retain
		/*
		 * HashSet<Employee> hs1 = new HashSet<Employee>(); Employee e4 = new
		 * Employee(); e4.setId(4); e4.setName("Durga"); e4.setRole("dev");
		 * e4.setSalary(2000000);
		 * 
		 * Employee e5 = new Employee(); e5.setId(5); e5.setName("Ratan");
		 * e5.setRole("dev"); e5.setSalary(2000000);
		 * 
		 * hs1.add(e4); hs1.add(e5); System.out.println("hs1::"+hs1);
		 * 
		 * System.out.println(hs); hs.retainAll(hs1); System.out.println(hs);
		 */
		
		//removve all elements from hs
		/*
		 * hs.removeAll(hs); System.out.println(hs);
		 */
		
		
	
	}
	

}
