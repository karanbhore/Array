package com.prowings.array.excercise;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 6, 5, 4, 7, 8, 9 };

		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);

	}

}
