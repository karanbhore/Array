package com.prowings.array.excercise;

public class Arraycopy {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num2 = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			num2[i] = num[i];
			System.out.println(num2[i]);

		}

	}

}
