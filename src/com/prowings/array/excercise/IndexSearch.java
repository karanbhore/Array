package com.prowings.array.excercise;

import java.util.Arrays;

public class IndexSearch {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int res = indexSearch(num, 1);
		System.out.println(res);
	}

	private static int indexSearch(int[] num, int n) {
		if(num==null) {
			return 0;
		}

		for (int i = 0; i < num.length; i++) {
			if(num[i]==n) {
				System.out.println(Arrays.toString(num));
				System.out.println("here is the index of :"+n);
				return i;
			}

		}
		System.out.println(Arrays.toString(num));
		System.out.println(n+" :No such element is present in given array present");
		return 0;
	}
}
