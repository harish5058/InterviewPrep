package com.interviewPrep.SolidPrinciples.DependencyInversion;

public class CreditCard implements Bankcard {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " rupees via credit card");
    }
}
