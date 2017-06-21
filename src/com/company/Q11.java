package com.company;

//Write a single program for following operation using overloading
// A) Adding 2 integer number
// B) Adding 2 double
// C) Multipling 2 float
// D) Multipling 2 int
// E) concate 2 string
// F) Concate 3 String

public class Q11 {
    
    private int add(int a,int b){
        return a+b;
    }
    
    private double add(double a,double b){
        return a+b;
    }
    
    private int product(int a,int b){
        return a*b;
    }
    
    private double product(double a,double b){
        return a*b;
    }
    
    private String str_concat(String a,String b){
        return a+b;
    }
    
    private String str_concat(String a,String b,String c){ return a+b+c;  }
    
    public static void main(String[] args) {
    
        Q11 obj =new Q11();
        System.out.println("Result for A.)"+obj.add(789,456)+"\n"+
                            "Result for B.)"+obj.add(256153.63566,65454.13123)+"\n"+
                            "Result for C.)"+obj.product(24,24)+"\n"+
                            "Result for D.)"+obj.product(36563.32,25616.21)+"\n"+
                            "Result for E.)"+obj.str_concat("To The New","Digital")+"\n"+
                            "Result for F.)"+obj.str_concat("To","The New","Digital"));
        
    }
    
}
