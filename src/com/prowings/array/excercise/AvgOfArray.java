package com.prowings.array.excercise;

public class AvgOfArray {

	public static void main(String[] args) {

		int[] nums = { 20, 30, 40, 50, 80 };

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			double avg = sum / nums.length;
			System.out.println("avg value :" + avg);

		}
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}

	}

}
