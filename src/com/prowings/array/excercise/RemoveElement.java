package com.prowings.array.excercise;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("given array : " + Arrays.toString(num));
		System.out.println();

		int elementToRemove = 5;
		System.out.println("elelment to remove" + elementToRemove);
		System.out.println();

		int index = -1;
		for (int i=0;i<num.length;i++) {
			if (num[i] == elementToRemove) { 
				index = i;
			break;}
		}
		for (int i = index; i < num.length - 1; i++) {
			num[i] = num[i + 1];
		}
		num = Arrays.copyOf(num, num.length - 1);
		System.out.println(Arrays.toString(num));

	}

}
