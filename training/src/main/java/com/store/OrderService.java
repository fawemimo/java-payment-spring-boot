package com.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        setPaymentService(paymentService);
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}