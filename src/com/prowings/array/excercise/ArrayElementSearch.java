package com.prowings.array.excercise;

public class ArrayElementSearch {

	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(contains(arr, 2011));
		System.out.println(contains(arr, 2017));
		
		int[] num= {1,2,3,4,5,6,2,1,4,5};
		

	}

}
