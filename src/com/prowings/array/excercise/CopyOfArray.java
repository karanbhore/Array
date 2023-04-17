package com.prowings.array.excercise;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("given array");
		System.out.println(Arrays.toString(num));
		System.out.println();

//		System.out.println("copy array");
//		int[] copyOfArray=Arrays.copyOf(num, num.length);
//		System.out.println(Arrays.toString(copyOfArray));

		int[] copyOfArray = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			copyOfArray[i]=num[i] ;
//			System.out.println(i);
		}
		System.out.println(Arrays.toString(copyOfArray));

	}
}
