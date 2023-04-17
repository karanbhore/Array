package com.prowings.array.excercise;

import java.util.Arrays;

public class ReverseStrinngArray {

	public static void main(String[] args) {

		String[] words = { "hello", "hi", "welcome", "ram" };
		System.out.println("given array" + Arrays.toString(words));

		for (int i = 0; i < words.length / 2; i++) {
			String temp = words[i];
			words[i] = words[words.length - i - 1];
			words[words.length - i - 1] = temp;

		}
		System.out.println(Arrays.toString(words));
	}
}
