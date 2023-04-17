package com.prowings.array.excercise;

import java.util.Arrays;

public class MaxMinSearch {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 15, 7, 8, 9, 10 };
		System.out.println("given array" + Arrays.toString(num));
		maxSearch(num);
		minSearch(num);
	}

	private static void minSearch(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min + "  is min number");

	}

	private static void maxSearch(int[] num) {

		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max + "  is max number");

	}

}
