package com.prowings.array.excercise;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Sample array
        Integer[] array = {1,2,3,4,5,6};
        
        // Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        
        // Print ArrayList
        System.out.println("ArrayList: " + list);
    }
}
