package com.prowings.array.excercise;

import java.util.Arrays;

public class ElementSearch {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		Arrays.sort(num);
//		System.out.println(Arrays.binarySearch(num, 19));
         
		
		boolean res=contains(num, 4);
		System.out.println(res);
		
		
	}

	private static boolean contains(int[] num, int i) {
		
		for(int n:num)
		{
			if(n==i) {
				return true;
			}
		}
		return false;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
