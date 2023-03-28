package com.prowings.arrays;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] arr= {44,4,5};
		Class c=arr.getClass();
		String name=c.getName();
		System.out.println(c);
		System.out.println(name);
		
		System.out.println("<<<<<<<<<<>>>>>>>>");
		
		int [] arr1= {33,44,55};
		for(int i:arr1) {
			System.out.println(i);
		}
		System.out.println("cloning arr1");
		int[] clonedArr=arr1.clone();
		for(int i1:clonedArr) {
			System.out.println(i1);
		}
		System.out.println("<<<<<<<<<>>>>>>>>>>");
		 
      		
		System.out.println(Arrays.toString(clonedArr));
		
		
		
		
		
		
		
	}
}
