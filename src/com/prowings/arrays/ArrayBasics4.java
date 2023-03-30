package com.prowings.arrays;

public class ArrayBasics4 {

	public static void main(String[] args) {
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 5;


//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		int[] numbers = new int[4];

		int j = 1;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = j;
			j++;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}
