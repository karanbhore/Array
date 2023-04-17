package com.prowings.array.excercise;

import java.util.HashSet;
import java.util.Set;

public class PairFinding {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 10 };

		int sum = 11;

		findPairs(num, sum);

	}

	private static void findPairs(int[] num, int sum) {
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<num.length;i++)
		{
			int temp=sum-num[i];
			if(set.contains(temp)) {
				System.out.println("("+num[i]+","+temp+")");
			}
			set.add(num[i]);
		}

		
		
		
		
		
		
		
		
		

	}

}
