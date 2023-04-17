package com.prowings.array.excercise;

public class CommonElement {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if( (num[i] == num[j]) && i!=j){
					System.out.println(num[j] + " : is common");
				}
			}
		}

	}
}
