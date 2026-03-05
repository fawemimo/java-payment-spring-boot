package com.store;

public class PayPalService implements PaymentService{
    @Override
    public void processPayment(double amount){
        System.out.println("PayPal Payment");
        System.out.println("Amount paid: " + amount);
    }
}
