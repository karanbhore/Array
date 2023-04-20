package com.prowings.array.excercise;

import java.util.Arrays;

public class LargestGapCalculator {

	public static void main(String[] args) {

		int[] num = { 5, 2, 3, 4, 6, 1, 2, 5 };

		int largestGap = calculateLargestGap(num);
System.out.println(largestGap );
	}

	public static int calculateLargestGap(int[] num) {
		if (num == null || num.length < 2) {
			return 0;
		}
		Arrays.toString(num);

		int largestGap = 0;
		for (int i = 1; i < num.length; i++) {
			int gap = num[i] - num[i - 1];
			if (gap > largestGap) {
				largestGap = gap;
			}
		}
		return largestGap;

	}

}
