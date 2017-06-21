package com.company;

import java.util.Scanner;

//Write a program to find the number of occurrences of the duplicate words in a string and print them ?

class Words {
    public String word;
    public int count;
    
    public Words(String word, int count) {
        this.word = word;
        this.count = count;
    }
}


public class Q2 {
    
    
    public static void main(String[] args) {
        
        int pos = 0, existing_pos,counter=0 ;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String[] mainString = input.nextLine().toLowerCase().split(" ");
        
        Words[] objArray = new Words[mainString.length];
        
        for (String s : mainString)
        {
            int flag = 0;
            for(existing_pos=0;existing_pos<pos;existing_pos++){
                if (objArray[existing_pos].word.equalsIgnoreCase(s))
                {
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 1) {
                objArray[existing_pos].count++;
            } else {
                objArray[pos] = new Words(s, 1);
                counter++;
            }
            pos++;
        }
        
        for (int i=0;i<counter;i++) {
            if(objArray[i].count>1)
                System.out.println(objArray[i].word + "" + objArray[i].count);
        }
    }
}
