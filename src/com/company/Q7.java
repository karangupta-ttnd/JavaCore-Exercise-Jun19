package com.company;


//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Q7 {
    
    static String firstName = "Karan";
    static String lastName = "Gupta";
    static int age = 24;
    
    static {
        System.out.println("This is a static block");
    }
    
    static void display() {
        System.out.println("First name :" + firstName);
        System.out.println("Last name :" + lastName);
        System.out.println("Age :" + age);
    }
    
    public static void main(String[] args) {
        Q7.display();
    }
}
