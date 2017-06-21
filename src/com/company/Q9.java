package com.company;


import java.io.BufferedReader;
import java.io.FileReader;

//Write a program to read text file & print the content of file using String Builder.

public class Q9 {
    
    public static void main(String[] args) {
        
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:/Users/karan Pc/IdeaProjects/Java Exercise Jun19/src/com/company/file.txt"));
            
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            System.out.println(sb.toString());
        }catch(Exception e)
        {e.printStackTrace();}
        
    }
    
}
