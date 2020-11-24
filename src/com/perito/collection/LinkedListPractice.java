package com.perito.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	static LinkedList<Employee> ll = new LinkedList<Employee>();

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

		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);

	}

	public static void main(String[] args) {

		// adding employee to ll
		addEmployee();

		// appending element in last
		/*
		 * Employee e6 = new Employee(); e6.setId(6); e6.setName("Mukesh");
		 * e6.setRole("dev"); e6.setSalary(2000000);
		 * 
		 * Employee e7 = new Employee(); e7.setId(7); e7.setName("Ambani");
		 * e7.setRole("dev"); e7.setSalary(2000000);
		 * 
		 * ll.add(e6); ll.add(e7); System.out.println(ll);
		 */

		// iterating through all the elements
		/*
		 * Iterator it = ll.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next());
		 * 
		 * }
		 */
		/*
		 * for (Employee e : ll) { System.out.println(e); }
		 */

		// iterate through all elements in a linked list starting at the specified
		// position
		/*
		 * for (int i = 1; i < ll.size(); i++) { System.out.println(ll.get(i)); }
		 */

		/*
		 * Iterator i = ll.listIterator(3); while (i.hasNext()) {
		 * System.out.println(i.next()); }
		 */

		// iterating in reverse order
		/*
		 * Iterator it = ll.descendingIterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		Employee e7 = new Employee();
		e7.setId(7);
		e7.setName("Soam");
		e7.setRole("dev");
		e7.setSalary(2000000);
		// inserting element in specified position
		// ll.add(2, e7);

		//inserting in first and last
		/*
		 * ll.addFirst(e7); ll.addLast(e7); System.out.println(ll);
		 */

		//inserting element in front of the ll
		/*
		 * ll.offerFirst(e7); System.out.println(ll);
		 */
		
		//getting first and last element in ll
		/*
		 * System.out.println("Fisrt::"+ll.getFirst());
		 * System.out.println("last::"+ll.getLast());
		 */
		  
		//getting element based on index  
		 // System.out.println(ll.get(3));
		
		
		//display the elements and their positions in a linked list
		/*
		 * for (int i = 0; i < ll.size(); i++) { System.out.println("i::"+i
		 * +"  "+ll.get(i)); }
		 */
		
		//remove element at index
		/*
		 * ll.remove(1); System.out.println(ll);
		 */
		
		//remove first and last element
		/*
		 * ll.removeFirst(); ll.removeLast();
		 */
		
		
		//swap element
		/*
		 * Collections.swap(ll, 0, 3); System.out.println(ll);
		 */
		
		//remove first element and return
		/*
		 * System.out.println(ll.pop()); System.out.println(ll);
		 */
		
		//fetch first elemeent but do not remove
		/*
		 * System.out.println(ll.peekFirst()); System.out.println(ll.peekLast());
		 */
	
		//System.out.println(ll.peek());
		
		//check given element is present or not
		/*
		 * ll.add(e7); System.out.println(ll.contains(e7));
		 */
		
		//convert ll to array
		/*
		 * ll.toArray(); System.out.println(ll);
		 */
		
		//replace an element
		/*
		 * ll.set(1, e7); System.out.println(ll);
		 */
		
	}

}
