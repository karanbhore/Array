package com.prowings.array.excercise;

public class ArrayBasics4 {

	public static void main(String[] args) {
		
		int[] numbers=new int[4];
		
		int j=1;
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=j;
			j++;
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
