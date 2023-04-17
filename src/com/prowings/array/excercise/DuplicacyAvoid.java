package com.prowings.array.excercise;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicacyAvoid {

	public static void main(String[] args) {
		int[] num = { 1, 2, 2, 2, 5, 6, 7, 8, 5, 4, 1, 2, 3, 6, 5 };

		int[] numwithoutDuplicates = DuplicacyAvoid(num);
		System.out.println(Arrays.toString(numwithoutDuplicates));
	}

	private static int[] DuplicacyAvoid(int[] num) {
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<num.length;i++)
		{
			set.add(num[i]);
		}
		int[] res=new int[set.size()];
		int i=0;
		for(Integer n :set) {
			res[i++]=n;
		}
		return res;
		
		
	}

}
