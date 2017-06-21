package com.company;

import java.util.Scanner;

//Find common elements between two arrays.

public class Q5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size, i, j;
        System.out.println("Enter length of 1st array:");
        size = Integer.parseInt(input.nextLine());
        int[] numberArray1 = new int[size];
        
        System.out.println("Enter length of 2nd array:");
        size = Integer.parseInt(input.nextLine());
        int[] numberArray2 = new int[size];
        
        System.out.println("Enter elements for 1st Array in sorted form:");
        for (i = 0; i < numberArray1.length; i++) {
            numberArray1[i] = input.nextInt();
        }
        
        System.out.println("Enter elements for 2nd Array in sorted form :");
        for (i = 0; i < numberArray2.length; i++) {
            numberArray2[i] = input.nextInt();
        }
        
        size = (numberArray1.length < numberArray2.length) ? numberArray1.length : numberArray2.length;
        
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (numberArray1[i] == numberArray2[j]) {
                    System.out.println("Common elements are:" + numberArray1[i]);
                }
            }
        }


//        System.out.println(Arrays.toString(numberArray1));
//        System.out.println(Arrays.toString(numberArray2));
        
        
    }
    
}
