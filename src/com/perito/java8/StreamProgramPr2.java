package com.perito.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramPr2 {
	
	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student4 = new Student("Payesh", 20, new Address("4567"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("9999")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3, student4);
		
		//Get student with exact match name "jayesh"
		System.out.println(students.stream().filter(std ->std.getName().equals("Jayesh")).collect(Collectors.toList()));
		
		//Get student with matching address "1235"
		System.out.println(students.stream().filter(std ->std.getAddress().getZipcode().equals("1235")).collect(Collectors.toList()));
		
		//Get all student having mobile numbers 3333
		List<Student> n = students.stream().filter(std -> std.getMobileNumbers().stream().anyMatch(num -> num.getNumber().equals("3333"))).collect(Collectors.toList());
		System.out.println(n.stream().map(std ->std.getName()).collect(Collectors.toList()));
		
		
		//Get all student having mobile number 1233 and 1234
		System.out.println(students.stream().filter(std->std.getMobileNumbers().stream().anyMatch(num -> num.getNumber().equals("1233")
														|| num.getNumber().equals("1234"))).collect(Collectors.toList())
						.stream().map(std -> std.getName()).collect(Collectors.toList()));
		
		//Create a List<Student> from the List<TempStudent>
		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tempStdList = Arrays.asList(tmpStud1, tmpStud2);
		
		List<Student> std = tempStdList.stream().map(tempStd -> new Student(tempStd.name,tempStd.age, tempStd.address, tempStd.mobileNumbers))
										.collect(Collectors.toList());
		std.forEach(System.out::println);
		
		//Convert List<Student> to List<String> of student name
		students.stream().map(std1 -> std1.getName()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//Convert List<students> to String
		String names = students.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(names);
		
		//Change the case of List<String>
		List<String> name = students.stream().map(Student :: getName).collect(Collectors.toList());
		name.stream().map(String:: toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
		//Sort List<String>
		name.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		//Conditionally apply Filter condition, say if flag is enabled then.
		boolean flag = true;
		if(flag)	{
			System.out.println(name.stream().count());
		}
		
	}

}
