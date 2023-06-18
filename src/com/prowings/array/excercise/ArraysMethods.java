package com.prowings.array.excercise;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		int[] arr= new int[16];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		int res=Arrays.binarySearch(arr, 15);
		System.out.println(res);
		
		System.out.println();
		Character [] alphabets= new Character[16];
		for(char i='A';i<='A'+15;i++)
		{
			alphabets[i-'A']=i;
		}
		System.out.println(Arrays.toString(alphabets));
		System.out.println();
		
		System.out.println(Arrays.copyOf(alphabets, alphabets.length));
		System.out.println();
		
		System.out.println(Arrays.copyOfRange(alphabets, 0, 10));
		System.out.println();
//		System.out.println(Arrays.asList(alphabets));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
