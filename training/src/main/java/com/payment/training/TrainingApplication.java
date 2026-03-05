package com.payment.training;

import com.store.OrderService;
import com.store.PayPalService;
import com.store.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	 static void main(String[] args) {

//		SpringApplication.run(TrainingApplication.class, args);
		var order = new OrderService(new PayPalService());
		order.placeOrder();
	 }

}
