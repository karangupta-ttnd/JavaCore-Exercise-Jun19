package com.company;

import java.util.Scanner;

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

public class Q4 {
    
    public static void main(String[] args) {
        
        float capital, small, special_symb, digits, space;
        capital = small = special_symb = digits = space = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String mainString = input.nextLine();
        
        if (mainString.equals("") || mainString.equals(" ")) {
            System.out.println("No input found");
            return;
        }
        
        char[] charArray = mainString.toCharArray();
        
        for (char ch : charArray) {
            
            if (Character.isLowerCase(ch)) {
                small++;
            } else if (Character.isUpperCase(ch)) {
                capital++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch != ' ') {
                special_symb++;
            } else {
                space++;
            }
            
        }
        
        System.out.println("\nNumber of small alphabets :" + Math.round(small) + "\nNumber of capital alphabets : " + Math.round(capital) + "\nNumber of digits : " + Math.round(digits) + "\nNumber of special characters : " + Math.round(special_symb));
        System.out.println("\nPercentage of small alphabets :" + Math.round((small / (charArray.length - space)) * 100) + "%\nPercentage of capital alphabets : " + Math.round((capital / (charArray.length - space)) * 100) + "%\nPercentage of digits : " + Math.round((digits / (charArray.length - space)) * 100) + "%\nPercentage of special characters : " + Math.round((special_symb / (charArray.length - space)) * 100) + "%");
        
    }
    
}
