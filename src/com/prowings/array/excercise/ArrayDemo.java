package com.prowings.array.excercise;


public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int[] arr1= {1,2,3,4,5,6,7,8,9,0};
		Class c=arr1.getClass();
		System.out.println(c);
		System.out.println();
		
		String name=c.getName();
		System.out.println(name);
		System.out.println();
		
		for(int i:arr1) {
			System.out.print(i);
		}
		System.out.println();
		
		String s="hello";
		int i=1;
		double d=50;
		int[] num= {1,2,3,4,5,6};
		Object[] mixobjects= {s,i,d,num};

		
	}


	
	
	
	
	
	
	
	
	
}
