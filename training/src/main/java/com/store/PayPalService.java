package com.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("paypal")
public class PayPalService implements PaymentService{

    @Override
    public void processPayment(double amount){
        System.out.println("PayPal Payment");
        System.out.println("Amount paid: " + amount);
    }
}
