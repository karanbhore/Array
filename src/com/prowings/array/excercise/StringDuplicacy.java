package com.prowings.array.excercise;

public class StringDuplicacy {

	public static void main(String[] args) {

		String[] words1 = { "hello", "ram", "how", "are", "you" };
		String[] words2 = { "hi", "sham", "i", "am", "fine", "how", "are", "you" };
		boolean found;

		for (int i = 0; i < words1.length; i++) {
			found = false;
			for (int j = 0; j < words2.length; j++) {
				if (words1[i].equals(words2[j])) {
					if (!found) {
						System.out.println("Common element: " + words2[j]);
						found = true;
					}
				}
			}
		}

	}
}
