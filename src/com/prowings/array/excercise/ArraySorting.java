package com.prowings.array.excercise;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] nums = { 100, 22, 55, 44, 88, 77 };

		String[] words = { "java", "python", "php", "c#" };

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

	}
}
