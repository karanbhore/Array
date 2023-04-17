package com.prowings.array.excercise;

import java.util.Arrays;

public class FindMaxElement {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60 };

		int res = findHighestElement(numbers);

		System.out.println("Highest element is : " + res);

		int res2 = findHighetElement2(numbers);

		System.out.println("Highest element is(using reverse array):" + res2);

		int res1 = findSecondHighestElement(numbers);

		System.out.println("Second Highest element is : " + res1);

	}

	private static int findSecondHighestElement(int[] numbers) {
     Arrays.sort(numbers);
     return numbers[numbers.length-2];
	}

	private static int findHighetElement2(int[] nums) {

		Arrays.sort(nums);
		
		int[] reversedArr=new int[nums.length];
		int j=0;
		
		for(int i=nums.length-1;i>=0;i--)
		{
			reversedArr[j]=nums[i];
			j++;
		}
		return reversedArr[0];
	}

	private static int findHighestElement(int[] numbers) {

		Arrays.sort(numbers);
		return numbers[numbers.length-1];
	}
	
	
}
