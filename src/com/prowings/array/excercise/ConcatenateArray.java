package com.prowings.array.excercise;

import java.util.Arrays;

public class ConcatenateArray {

	public static void main(String[] args) {

		int[] numbers1 = { 10,40, 20, 30 };
		int[] numbers2 = { 40, 50, 65, 25 };

		int[] concatedArray = concateTwoArrays(numbers1, numbers2);

		System.out.println(Arrays.toString(concatedArray));

	}

	private static int[] concateTwoArrays(int[] numbers1, int[] numbers2) {

		int[] result = new int[numbers1.length + numbers2.length];

		int j = 0;
		for (int i = 0; i < result.length; i++) {
			if (i <= numbers1.length - 1)
				result[i] = numbers1[i];
			else {
				result[i] = numbers2[j];
				j++;
			}

		}
		return result;

	}

}
