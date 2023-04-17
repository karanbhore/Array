package com.prowings.array.excercise;

public class ArraysSum {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;

		for (int i : nums) {
			sum += i;
			System.out.println("the sum is :" + sum);
		}

	}
}
