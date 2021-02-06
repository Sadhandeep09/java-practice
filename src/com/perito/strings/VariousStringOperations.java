package com.perito.strings;

import java.lang.Character.Subset;

public class VariousStringOperations {

	public static void main(String[] args) {
		String s1 = "      Hello World      ";
		String s2 = "Hello World"; // s1 and s2 are same objects

		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		String s3 = "abcd";
		String s4 = "ABCD";

		System.out.println(s3.equals(s4));
		s4 = "abcd";
		System.out.println(s3.equals(s4));

		System.out.println(s3 == s4);
		System.out.println(s1 == s2);

		System.out.println("-----------------");

		String s5 = new String("Hello World");
		System.out.println(s1.equals(s5));
		System.out.println(s1 == s5);
		System.out.println(s1.hashCode());
		System.out.println(s5.hashCode());

		System.out.println("----------");
		// converting char array to string
		char[] ch = { 'j', 'a', 'v', 'a' };
		System.out.println(ch);
		String s6 = new String(ch);
		System.out.println(s6);

		// converting String to array
		char[] ch1 = s1.toCharArray();

		System.out.println("----------------");
		System.out.println(s2.replace('H', 'D'));
		s2 = s2.replace('H', 't');
		System.out.println(s2);

		System.out.println(s1.concat(s2));
		System.out.println(s1.intern());
		System.out.println(s1.indexOf("Hel"));
		System.out.println(s1);
		System.out.println(s1.trim());

		System.out.println("----------");

		String s7 = "java";
		System.out.println(s7.hashCode());
		s7 = "java is easy";
		System.out.println(s7.hashCode());

		System.out.println("-------------");
		System.out.println(s7.substring(1));
		System.out.println(s7.substring(1, 6));

		System.out.println("-------------------String builder----------------");
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println(sb1.append("Hello boss"));
		System.out.println(sb1.hashCode());
		System.out.println(sb1);
		sb1.append("good morning");
		sb1.append(true);
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		System.out.println("-----");
		sb1.insert(2, "sir");
		System.out.println(sb1);
		sb1.delete(2, 5);
		System.out.println(sb1);
		sb1.reverse();
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.replace(0, 5, "Hi");
		System.out.println(sb1);
		System.out.println(sb1.substring(5, 10));
		
		
		

	}

}
