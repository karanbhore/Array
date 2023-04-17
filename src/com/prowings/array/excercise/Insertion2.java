package com.prowings.array.excercise;

import java.util.Arrays;

public class Insertion2 {

	public static void main(String[] args) {

		String[] words = { "hi", "ram", "sham", "lata", "bal" };
		System.out.println(Arrays.toString(words) + "\nthis is given array");

		int index = 1;
		String insert = "welcome !!";

		for (int i = 0; i < words.length - 1; i++) {
			if (i == index) {
				words[index] = insert;
			}
		}
		System.out.println(Arrays.toString(words));
		System.out.println();

	}
}
