package com.perito.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgramsPr1 {

	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student4 = new Student("Jayesh", 20, new Address("4567"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("9999")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

	//	List<Student> students = Arrays.asList(student1, student2, student3, student4);
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		/*
		 * for (Student s : students) { System.out.println(s); }
		 */

		// System.out.println(students);

		// getting students with name Jayesh
		Optional<Student> std = students.stream().filter(student -> student.getName().equals("Jayesh")).findAny();
		System.out.println(std.isPresent() ? std.get().getName() : "No result found");
		System.out.println("--------------------------");

		// getting students with address 1236
		Optional<Student> stdAdd = students.stream().filter(student -> student.getAddress().getZipcode().equals("1236"))
				.findAny();
		System.out.println(stdAdd.isPresent() ? stdAdd.get().getName() : "No students found");
		System.out.println("--------------------------");

		// getting all students having mobile numbers 3333

		List<Student> res = students.stream()
				.filter(std1 -> std1.getMobileNumbers().stream().anyMatch(num -> num.getNumber().equals("3333")))
				.collect(Collectors.toList());

		List<String> res1 = res.stream().map(std2 -> std2.getName()).collect(Collectors.toList());

		System.out.println(res1);
		System.out.println("--------------------------");

		// Get all student having mobile number 1233 and 1234
		List<Student> res2 = students.stream()
				.filter(std3 -> std3.getMobileNumbers().stream()
						.anyMatch(num1 -> num1.getNumber().equals("1233") || num1.getNumber().equals("1234")))
				.collect(Collectors.toList());

		System.out.println(res2.stream().map(std4 -> std4.getName()).collect(Collectors.toList()));
		System.out.println("-------------6--------------");

		// Create a List<Student> from the List<TempStudent>
		TempStudent tmpStud1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

		List<TempStudent> tempStdList = Arrays.asList(tmpStud1, tmpStud2);

		List<Student> stdList = tempStdList.stream()
				.map(tempStd -> new Student(tempStd.name, tempStd.age, tempStd.address, tempStd.mobileNumbers))
				.collect(Collectors.toList());

		System.out.println(stdList);
		System.out.println("---------------------------");

		// Convert List<Student> to List<String> of student name

		List<String> res5 = students.stream().map(std5 -> std5.getName()).collect(Collectors.toList());
		String res6 = res5.stream().collect(Collectors.joining(","));
		System.out.println(res6);
		System.out.println("--------------------");

		/*
		 * List<String> studentsName = students.stream() .map(Student::getName)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(studentsName.stream().collect(Collectors.joining(",")));
		 * System.out.println("--------------------");
		 */

		// Convert List<students> to String
		System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",,")));
		System.out.println(students.stream().map(Student::getAge).collect(Collectors.toList()));
		System.out.println("----------------7687-------------");
		// Change the case of List<String>
		List<String> nameList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		nameList.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-----------------------------");
		// sorting the list of string
		nameList.stream().sorted().forEach(System.out::println);
		System.out.println("-----------------------------");
		
		//using flag
		boolean flag = true;
		if(flag)	{
			nameList.stream().map(String :: toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
		}
		
	}

}
