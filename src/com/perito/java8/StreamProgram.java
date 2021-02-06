package com.perito.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student4 = new Student("Payesh", 20, new Address("4567"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("9999")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println(list.stream().collect(Collectors.toList()));
		 List<String> res = list.stream().filter(student -> student.getAge() >18)
									.map(student ->student.getName())
									.collect(Collectors.toList());
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
