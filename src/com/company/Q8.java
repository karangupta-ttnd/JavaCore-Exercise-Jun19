package com.company;

import java.util.Scanner;

//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer.

public class Q8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuffer mainString = new StringBuffer();
        mainString.append(input.nextLine());
        
        mainString = mainString.reverse();
        System.out.println("Reversed StringBuffer Content : " + mainString);
        
        mainString.delete(4, 10);
        System.out.println(mainString);
        
    }
}
