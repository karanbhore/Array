package com.prowings.array.excercise;

public class NegetativeDominant {

	public static void main(String[] args) {

		int[] num1 = { -5, -9, 4, 5, -2 };
		int[] num2 = { -5, -4, -5, -2 };

		System.out.println(isNegativeDominant(num1) + " has negativeCount ");
		System.out.println(isNegativeDominant(num2));

	}

	private static boolean isNegativeDominant(int[] num) {

		int negativeCount = 0;
		int positiveCount = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				negativeCount++;
			} else {
				positiveCount++;
			}

		}

		System.out.println("has negative count :" + negativeCount);
		System.out.println();
		System.out.println("has positive count :" + positiveCount);
		System.out.println();
		return negativeCount > positiveCount;

	}
}
