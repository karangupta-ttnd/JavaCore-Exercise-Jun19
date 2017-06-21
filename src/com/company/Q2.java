package com.company;

import java.util.Scanner;

//Write a program to find the number of occurrences of the duplicate words in a string and print them ?

public class Q2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String mainString = input.nextLine().toLowerCase();
		String []strs=mainString.split(" ");
		
		int[] frequency=new int[strs.length];

		for(int i=0;i<frequency.length;i++)
			frequency[i]=0;
		
		for(int i=0;i<strs.length;i++)
		{
			for(int j=0;j<strs.length;j++)
			{
				if(strs[i].equals(strs[j]))
				{
					frequency[i]++;
				}
			}
		}
		
		for(int s=0;s<strs.length;s++)
		{
			System.out.println(strs[s]+" = "+frequency[s]);
			
		}
		
	}

}
