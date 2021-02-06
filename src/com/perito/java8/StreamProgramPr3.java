package com.perito.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgramPr3 {

	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		//retrieving the list
	//	list.stream().forEach(System.out::println);
		/*
		 * for (Student std : list) { System.out.println(std); }
		 */
		
		//retrieving student with name jayesh
		/*
		 * Optional<Student> stdList = list.stream().filter(std ->
		 * std.getName().equalsIgnoreCase("Jayesh")).findAny();
		 * System.out.println(stdList.isPresent() ? stdList.get().getName()
		 * :"No student found");
		 */
		
		
		//getting student with matching address 1234
		/*
		 * Optional<Student> stdList1 = list.stream().filter(std ->
		 * std.getAddress().getZipcode().equals("1234")).findAny();
		 * System.out.println(stdList1.isPresent()?
		 * stdList1.get().getName():"No students found");
		 */
		
		
		//getting students with mobile number 3333
		/*
		 * List<Student> stdList2 =
		 * list.stream().filter(std->std.getMobileNumbers().stream().anyMatch(num ->
		 * num.getNumber(). equals("3333"))).collect(Collectors.toList());
		 * //System.out.println(stdList2); List<String> res =
		 * stdList2.stream().map(std->std.getName()).collect(Collectors.toList());
		 * System.out.println(res);
		 */
		
		//Get all student having mobile number 1233 and 1234
		/*
		 * List<Student> stdList3 =
		 * list.stream().filter(std->std.getMobileNumbers().stream().anyMatch(num ->
		 * num.getNumber() .equals("1233") ||
		 * num.getNumber().equals("1234"))).collect(Collectors.toList());
		 * 
		 * System.out.println(stdList3);
		 */
		
		//Create a List<Student> from the List<TempStudent>
		
		/*
		 * TempStudent tmpStud1 = new TempStudent( "Jayesh1", 201, new Address("12341"),
		 * Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
		 * 
		 * TempStudent tmpStud2 = new TempStudent( "Khyati1", 202, new Address("12351"),
		 * Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new
		 * MobileNumber("12331")));
		 * 
		 * List<TempStudent> tempList = new ArrayList<TempStudent>();
		 * tempList.add(tmpStud1); tempList.add(tmpStud2);
		 * 
		 * List<Student> stdres= tempList.stream().map(std -> new Student(std.name,
		 * std.age, std.address, std.mobileNumbers)) .collect(Collectors.toList());
		 * System.out.println(stdres);
		 * 
		 */
		//converting list of student name to list of string
		List<String> lst = list.stream().map(std->std.getName()).collect(Collectors.toList());
		System.out.println(lst);
		
	}
	
	

}
