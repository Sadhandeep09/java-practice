package com.perito.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
	static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

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

		map.put(101, e1);
		map.put(102, e2);
		map.put(103, e3);
		map.put(104, e4);
		map.put(105, e5);
	}

	public static void main(String[] args) {
		addEmployee();
		// System.out.println(map);

		// fetch the value with associated key
		/*
		 * for (Map.Entry<Integer, Employee> m : map.entrySet()) {
		 * System.out.println(m.getKey()+" :::: " + m.getValue()); }
		 */

		// System.out.println(map.size());

		// copy one hm to another hm
		/*
		 * Map<Integer, Employee> map1 = new HashMap<Integer, Employee>();
		 * map1.putAll(map); System.out.println(map1);
		 */

		// delete all element
		/*
		 * map.clear(); System.out.println(map);
		 */

		// checking map contains the specific key or not
		// System.out.println(map.containsKey(101));

		//setting the set view for map
		/*
		 * Set set = map.entrySet(); System.out.println(set);
		 */
		
		//getting the element 
	//	System.out.println(map.get(101));
		
		//getting only the keys present in map using set view
		/*
		 * Set set = map.keySet(); System.out.println(set);
		 */
		
		//getting only the values present in the map without key
	//	System.out.println(map.values());
		
		
	}

}
