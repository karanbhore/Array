package com.prowings.array.excercise;

import java.util.Arrays;

public class DuplicacySearch {

	public static void main(String[] args) {

		int[] num = { 1, 2, 4, 4, 5, 6, 7, 8, 9, 1, 0 };
		System.out.println("given array " + Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("duplicate element is :" + num[j]);
				}
			}
		}

	}
}
