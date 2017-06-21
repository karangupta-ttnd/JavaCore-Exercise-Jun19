package com.company;

import java.util.Scanner;

//Write a program to find the number of occurrences of a character in a string without using loop?

public class Q3 {
    
    public int getCount(String s, char ch){
        int count;
        if (s.indexOf(String.valueOf(ch))==-1){
            return 0;
        }else{
            int index=s.indexOf(String.valueOf(ch));
            String ss=s.substring(index+1,s.length());
            count=getCount(ss,ch)+1;
            return count;
        }
    }
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        Q3 obj=new Q3();
        
        System.out.println("Enter a string:");
        String mainString = input.nextLine().toLowerCase();
        
        System.out.println("Enter a char to find:");
        char testChar= input.next().charAt(0);
        
        int count=obj.getCount(mainString,testChar);
        System.out.println("No of occurance of "+testChar+" : "+ count);
    }
    
}
