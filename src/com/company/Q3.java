package com.company;

import java.util.Scanner;

//Write a program to find the number of occurrences of a character in a string without using loop?

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String mainString = input.nextLine().toLowerCase();
		String []strs=new String[50];
		strs=mainString.split("");
		
		/*
		for(String s : strs)
		{
			System.out.println(s);
		}
		*/
	}

}
