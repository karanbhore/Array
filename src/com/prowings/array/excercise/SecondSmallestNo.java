package com.prowings.array.excercise;

public class SecondSmallestNo {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int smallestNo = num[0];
        int secondSmallestNo = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallestNo) {
                secondSmallestNo = smallestNo;
                smallestNo = num[i];
            } else if (num[i] < secondSmallestNo && num[i] != smallestNo) {
                secondSmallestNo = num[i];
            }
        }
        System.out.println("the second smallest no is :" + secondSmallestNo);
    }
}
