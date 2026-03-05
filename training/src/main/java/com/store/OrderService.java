package com.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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

    @PreDestroy
    public void cleanup() {
        System.out.println("Orderservice cleanup");
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}