package com.prowings.array.excercise;

import java.util.Arrays;

public class copyAnArray {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		int[] numbersCopy = numbers.clone();

		System.out.println(Arrays.toString(numbersCopy));

		System.out.println(numbers == numbersCopy);

	}

}
