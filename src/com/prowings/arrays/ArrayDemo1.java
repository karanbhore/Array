package com.prowings.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) throws NullPointerException {
		int i = 1;
		String s = "";
		String hello = "hello";
		String Hi = "Hi";
		double d = 4d;

		Object[] objects = { i, s, hello, Hi, d };

		for (Object i1 : objects) {

			System.out.println(i1);

			System.out.println(i1.getClass().getName());

		}
		System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>");
		
		for(Object i2:objects) {
			if(i2 instanceof Double) {
				System.out.println(i2);
			}
		}

	}
}
