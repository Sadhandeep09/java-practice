package com.perito.strings;

public class StringsProgram {

	public static long countCharSequence(String str, char c)	{
		/*
		 * int count =0; for (int i = 0; i < str.length()-1; i++) { if
		 * (str.charAt(i)==c) { count++; } } return count;
		 */
		return str.chars().filter(ch -> ch==c).count();
		
	}
	
	public static String concatenateWithItself(String str , int no)	{
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < no; i++) {
			s.append(str);
		}
		return s.toString();
	}
	
	public static boolean isEndsWith(String str,String s)	{
		if(str.endsWith(s))	{
			return true;
		}
		else	{
			return false;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String s1 = "I am working as a software developer since last 3 years";
		
		//System.out.println(countCharSequence(s1, 'a'));
		/*
		 * String s2 = "java"; System.out.println(concatenateWithItself(s2, 3));
		 */
		
	//	System.out.println(isEndsWith(s1, "years"));
		
		System.out.println(s1.hashCode());
		
		s1 = s1.toUpperCase();
		System.out.println(s1.hashCode());
		
		
		StringBuffer sb = new StringBuffer("apple   is ");
		System.out.println(sb.hashCode());
		sb.append("good");
	//	sb.reverse();
		
	//	sb.chars().toArray();
	//	sb.trimToSize();
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		
	
	}
	
	

}
