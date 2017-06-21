package com.company;


//Write a program to display values of enums using a constructor & getPrice() method(Example display house & thier prices ).

public class Q10 {
    
    private enum House {
        
        _2BHK(1000),_3BHK(2000), _4BHK(3000), _5BHK(5000);
        
        private int price;
    
        private House(int val){
            this.price=val;
        }
        
        public int getPrice(){
            return this.price;
        }
        
    }
    
    public static void main(String[] args) {
        
        for (House objHouse : House.values())
            System.out.println(objHouse+" "+objHouse.getPrice());
    
    
    }
}
