package com.prowings.array.excercise;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("given array" + Arrays.toString(num));

		int insertNo = 20;
		int index = 2;

		for(int i=0;i<num.length;i++)
		{
			if(i==index)
			{
				num[i]=insertNo;
			}
			
		}
		System.out.println(Arrays.toString(num));
	}
}
