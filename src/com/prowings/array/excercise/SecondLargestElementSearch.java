package com.prowings.array.excercise;

public class SecondLargestElementSearch {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int largest = num[0];
		int secondLargest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];

			} else if (num[i] > secondLargest && num[i] != largest) {
				secondLargest = num[i];
			}
		}
		System.out.println("the second largest num is :" + secondLargest);

	}

}
