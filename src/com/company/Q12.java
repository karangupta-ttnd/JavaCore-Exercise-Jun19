package com.company;

//Create 3 sub class of bank SBI, BOI, ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,
// print details of every banks.

abstract class Bank {
    
    public double rateOfInterest;
    
    public abstract double getDetails();
    
}

class SBI extends Bank {
    
    public SBI() {
        rateOfInterest = 3.7;
    }
    
    @Override
    public double getDetails() {
        return rateOfInterest;
    }
}

class BOI extends Bank {
    
    public BOI() {
        rateOfInterest = 12.5;
    }
    
    @Override
    public double getDetails() {
        return rateOfInterest;
    }
    
}

class ICICI extends Bank {
    
    public ICICI() {
        rateOfInterest = 7.9;
    }
    
    @Override
    public double getDetails() {
        return rateOfInterest;
    }
}


public class Q12 {
    
    public static void main(String[] args) {
        
        Bank obj1 = new SBI();
        Bank obj2 = new BOI();
        Bank obj3 = new ICICI();
        System.out.println("Result of SBI: " + obj1.getDetails());
        System.out.println("Result of BOI: " + obj2.getDetails());
        System.out.println("Result of ICICI: " + obj3.getDetails());
        
    }
    
}
