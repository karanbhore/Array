package com.prowings.array.excercise;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 8, 4 };
		String[] words = { "a", "sd", "hg" };
		Object[] mix = { num, words };
		int[] num2 = { 4, 5, 6, 7 };
        int[] num4=Arrays.copyOf(num, num.length);
        
        System.out.println(Arrays.toString(num4));
        System.out.println("<<<<>>>");
                            
		Arrays.sort(num);

		System.out.println(Arrays.toString(num));
		System.out.println();

		System.out.println(Arrays.binarySearch(num, 1));
//	System.out.println(Arrays.toString(num));

		System.out.println(Arrays.equals(num, num2));
		Arrays.fill(num2, 2);
		System.out.println(Arrays.toString(num2));
		
//		System.out.println(Arrays.copyOf(num2, num).toString());
//		System.out.println(Arrays.copyOfRange(num, num, num));
		System.out.println(Arrays.deepToString(mix));
		System.out.println();
		

	}

}
