package com.perito.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CopyALtoAL {

	public static void main(String[] args) {

		List l1 = new ArrayList();
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("Abhi");

		Employee emp2 = new Employee();
		emp2.setId(11);
		emp2.setName("Abhinav");

		Employee emp3 = new Employee();
		emp3.setId(12);
		emp3.setName("Abhiraj");

		l1.add(emp1);
		l1.add(emp2);
		l1.add(emp3);

		List l2 = new ArrayList();
		Employee emp4 = new Employee();
		emp4.setId(101);
		emp4.setName("hari");

		Employee emp5 = new Employee();
		emp5.setId(101);
		emp5.setName("hariram");

		Employee emp6 = new Employee();
		emp6.setId(102);
		emp6.setName("hariprasad");

		l2.add(emp4);
		l2.add(emp5);
		l2.add(emp6);

		 l2.addAll(l1);		//l2 will have elements of both l1 and l2

	//	 Collections.copy(l2, l1);		//l2 elements will be replace by l1 element
		System.out.println("l1::"+l1);
		System.out.println("l2::" + l2);

	}

}
