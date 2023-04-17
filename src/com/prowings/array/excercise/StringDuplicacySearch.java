package com.prowings.array.excercise;

import java.util.Arrays;

public class StringDuplicacySearch {

	public static void main(String[] args) {

		String[] words = { "hello", "hello", "hi", "welcome", "raj" };
		System.out.println("given array" + Arrays.toString(words));

		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i+1; j < words.length; j++)

				if (words[i].equals(words[j]) && (i!=j)){
					System.out.println("duplicate word is :" + words[j]);
				}

		}

	}
}
