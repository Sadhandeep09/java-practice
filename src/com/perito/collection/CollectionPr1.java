package com.perito.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

public class CollectionPr1 {

	// 1-iterate arraylist
	public static void iterateAL(List<Employee> list) {
		/*
		 * for (Object emp : list) { System.out.println(emp); }
		 */

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// list.stream().filter(emp
		// ->emp.getRole().equalsIgnoreCase("Dev")).forEach(System.out::println);

	}

	// 2-convert List to Array
	public static void convertALtoArray(List list) {

		Object[] arr = list.toArray();
		for (Object employee : arr) {
			System.out.println(employee);
		}

	}

	// 3-iterate a HashSet
	public static void iterateHS(Set set) {
		for (Object object : set) {
			System.out.println(object);
		}
	}

	// 4-check if element(value) exists in ArrayList?
	public static void isExist(String name, List<Employee> list) {

		Optional<Employee> employee = list.stream().filter(emp -> emp.getName().equals(name)).findAny();
		System.out.println(employee.isPresent() ? employee.get().toString() : "Not Available");
	}

	// 5-check if element exists in HashSet?
	public static void isExistinHS(String name, Set<Employee> set) {

		Optional<Employee> employee = set.stream().filter(emp -> emp.getName().equals(name)).findAny();
		System.out.println(employee.isPresent() ? employee.get().toString() : "Not Available");
	}

	// 6-6-convert Array to List?
	public static void convertArrToList(Employee[] arr) {
		List l = Arrays.asList(arr);
		for (Object object : l) {
			System.out.println(object);
		}
	}

	// 10-iterating hashMap
	public static void iterateHM(Map map) {
		for (Object key : map.keySet()) {
			System.out.println("Key : " + key + " Value: " + map.get(key));
		}
	}

	// 11-sorting hashMap
	public static void sortHM(Map hashmap) {
		// sort By key

		Map map1 = new TreeMap<>(hashmap);
		for (Object key : map1.keySet()) {
			System.out.println(key + "    " + map1.get(key));
		}

		// sortBy Values

	}

	// 12-sort ArrayList using Comparable and Comparator?
	public static void sortAL(List list) {

	}

	// 13-sort ArrayList in descending order
	public static void sortALDesOrder(ArrayList list) {
		Collections.reverse(list);
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

	// 14-converting hashset to araay
	public static void HashSetToArray(HashSet hashSet) {
		Employee[] empArr = new Employee[hashSet.size()];
		hashSet.toArray(empArr);

		for (Employee employee : empArr) {
			System.out.println(employee);
		}

	}

	// 15-reverse al
	public static void reverseAL(ArrayList al) {
		Collections.reverse(al);

		for (Object object : al) {
			System.out.println(object);
		}
	}

	// 16-iterating treemap
	public static void iterateTM(TreeMap tMap) {

		Set set = tMap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Employee> object = (Entry<Integer, Employee>) it.next();
			System.out.println(object.getKey() + " and ");
			System.out.println(object.getValue());

		}

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Daniel", "Dev", 100000.00);
		Employee e2 = new Employee(102, "John", "Dev", 100000.00);
		Employee e3 = new Employee(103, "Cristian", "Dev", 100000.00);
		Employee e4 = new Employee(104, "Polard", "Testing", 100000.00);
		Employee e5 = new Employee(105, "Victor", "Dev", 100000.00);
		Employee e6 = new Employee(105, "Victor", "Dev", 100000.00);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e5);

		HashSet set = new HashSet<Employee>();
		set.addAll(al);

		Employee[] empArr = new Employee[] { e1, e2, e3, e4, e5 };

		// 1
		iterateAL(al);
		System.out.println("-------------------");
		// 2
		convertALtoArray(al);
		System.out.println("-------------------");
		// 3
		iterateHS(set);
		System.out.println("-------------------");

		// 4
		isExist("Victor", al);
		System.out.println("-------------------");

		// 5
		isExistinHS("Cristian", set);
		System.out.println("-------------------");

		// 6
		System.out.println(Arrays.toString(empArr));
		convertArrToList(empArr);
		System.out.println("-------------------");

		// 7length of the ArrayList?
		System.out.println(al.size());
		System.out.println("-------------------");

		// 8-add elements to the HashMap
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(101, e1);
		map.put(102, e2);
		map.put(103, e3);
		map.put(104, e4);
		map.put(105, e5);

		System.out.println(map);
		System.out.println("-------------------");
		// 9
		System.out.println(map.isEmpty());
		System.out.println("-------------------");
		// 10
		iterateHM(map);
		System.out.println("-------------------");

		// 11-sorting hashMap
		sortHM(map);
		System.out.println("-------------------");

		// 12

		// 13
		sortALDesOrder(al);
		System.out.println("-------------------");
		// 14
		HashSetToArray(set);
		System.out.println("-------------------");
		// 15
		reverseAL(al);
		System.out.println("-------------------");

		TreeMap<Integer, Employee> tMap = new TreeMap<Integer, Employee>();
		tMap.put(1001, e1);
		tMap.put(1002, e2);
		tMap.put(1003, e3);
		tMap.put(1004, e4);
		tMap.put(1005, e5);
		tMap.put(1006, e5);
		// 16-iterating treemap
		iterateTM(tMap);

	}

}
