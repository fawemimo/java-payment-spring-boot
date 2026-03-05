package com.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiURL}")
    private String stripeApiURL;

    @Value("${stripe.enabled}")
    private boolean stripeEnabled;

    @Value("${stripe.timeout}")
    private int stripeTimeout;

    @Value("${stripe.supported-currencies}")
    private List<String>  supportedCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Stripe Payment");
        System.out.println("Amount paid: " + amount);

        System.out.println("Currencies: " + supportedCurrencies);
        System.out.println("Stripe API URL: " + stripeApiURL);
    }
}
