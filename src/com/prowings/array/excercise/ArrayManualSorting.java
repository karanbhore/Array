package com.prowings.array.excercise;

import java.util.Arrays;

public class ArrayManualSorting {

	public static void main(String[] args) {
		int[] numbers = { 10, 2, 5, 1 };
		System.out.println(Arrays.toString(numbers)+"\n this is given array");

		System.out.println(">>>>>>>>,<<<<<<<");

		int[] sortedNumbersArrayDecendingOrder = sortGivenArrayDecendingOrder(numbers);
		System.out.println(Arrays.toString(sortedNumbersArrayDecendingOrder));

		int[] sortedNumberArrayAccendingOrder = sortGivenArrayAccendingOrder(numbers);
		System.out.println(Arrays.toString(sortedNumberArrayAccendingOrder));

	}

	private static int[] sortGivenArrayAccendingOrder(int[] numbers) {

		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		return numbers;

	}

	private static int[] sortGivenArrayDecendingOrder(int[] numbers) {

		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
 					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;

	}

}
