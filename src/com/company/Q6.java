package com.company;


//There is an array with every element repeated twice except one. Find that element?

public class Q6 {
    
    public static void main(String[] args) {
    
        int[] intArray={88,44,55,44,78,88,78};
        int result=0;
        for (int s : intArray) {
            result ^= s;
        }
        System.out.println("The only non - repeating number is: " + result);
        
    }
    
}
