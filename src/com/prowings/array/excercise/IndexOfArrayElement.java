package com.prowings.array.excercise;

public class IndexOfArrayElement {

	public static int findIndex(int[] num, int item) {
		if (num == null)
			return -1;

		int len = num.length;
		int i = 0;
		while (i < len) {
			if (num[i] == item) {
				return i;
			} else
				return i = i + 1;

		}
		return -1;

	}
	public static void main(String[] args) {
		
		int[] num= {10,20,30,40,50,60,70,80,90};
		System.out.println("Index position of 25:"+findIndex(num,25));
		System.out.println("Index position of 25:"+findIndex(num,20));
		
		
		
		
		
		
		
		
		
	}

}
