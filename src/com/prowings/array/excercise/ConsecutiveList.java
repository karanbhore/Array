package com.prowings.array.excercise;

import java.util.Arrays;

public class ConsecutiveList {

	public static void main(String[] args) {

		int[] num1 = { 1, 5, 3, 4, 5, 6, 7, 8, 9 };
		int[] num2 = { 1, 1, 3, 4, 5, 6, 7, 8, 9 };
		int[] num3 = { 1, 8, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(isConsecutive(num1));
		System.out.println(isConsecutive(num2));
		System.out.println(isConsecutive(num3));

	}

	public static boolean isConsecutive(int[] num) {
		int n = num.length;

		Arrays.sort(num);

		for (int i = 0; i < n - 1; i++) {
			if (num[i] == num[i + 1]) {
				return false;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			if (num[i + 1] - num[i] != 1) {
				return false;
			}
		}
		return true;

	}

}
