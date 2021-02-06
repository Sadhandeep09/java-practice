package com.perito.java8.lambda;

public class DrawableImpl {

	public static void main(String[] args) {

		//without lambda expression
		Drawable d1 = new Drawable() {

			@Override
			public void draw() {
				System.out.println("Draw");
			}
		};
		
		
		Drawable d2 = ()->{System.out.println("Drawable lambda");};
		
		d1.draw();
		d2.draw();
	}
}
