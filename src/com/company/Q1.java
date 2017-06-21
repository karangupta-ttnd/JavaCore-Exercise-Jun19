package com.company;

import java.util.Scanner;

// Write a program to replace a substring inside a string with other string ?

public class Q1 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String mainString = input.nextLine().toLowerCase();
        
        System.out.println("Enter the part you want to replace:");
        String stringToBeReplaced = input.nextLine().toLowerCase();
        
        System.out.println("Enter the part you want to replace with:");
        String stringToReplaceWith = input.nextLine().toLowerCase();
        
        System.out.println("Result:" + mainString.replace(stringToBeReplaced, stringToReplaceWith));
        
    }
    
}
