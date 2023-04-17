package com.prowings.array.excercise;

import java.util.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {

		int[] numbers = { 10, 2, 5, 1, 2 };

		int[] copyOfNumbers = Arrays.copyOf(numbers, 5);

		System.out.println(Arrays.toString(copyOfNumbers));
		

	}
}
