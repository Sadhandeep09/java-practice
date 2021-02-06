package com.perito.oop;

interface Example	{
	public  void m1();

	public static void m2() {
		System.out.println("interface static m2()");
	}
	
	public default void m3()	{
		System.out.println("interface default m3()");
	}
	
}

class Text implements Example {
	public int a = 10;
	
	@Override
	public void m1() {
		System.out.println("Text m1()");
		System.out.println(this.a);
	}
	
	public static void m2() {
		System.out.println("Text static m2()");
	}
}

public class OopProgramming extends Text implements Example {

	public int a = 20;
	
	@Override
	public void m1() {
		super.m1();
		System.out.println("oop m1()");
		System.out.println(this.a);
	}
	
	public static void m2() {
		System.out.println("oop static m2()");
	}
	
	/*
	 * @Override public void m3() { System.out.println("oop m3()"); }
	 */

	public static void main(String[] args) {
		//calling non-static methods
		Text t = new Text();
		t.m1();
		
	//	t.m3();
		
		
		//calling static methods
	//	OopProgramming.m2();
	//	Example.m2();
	//	Text.m2();
		
	}

}
