package com.store;

import jakarta.annotation.PostConstruct;

//@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        setPaymentService(paymentService);
        System.out.println("OrderService created");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    @PostConstruct
    public void init() {
        System.out.println("Orderservice post cpntructor");
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}