package com;

import com.excerise.EmailNotificationService;
import com.excerise.HeavyResource;
import com.excerise.NotificationManager;
import com.store.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TrainingApplication {

	 static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(TrainingApplication.class, args);
		var order = context.getBean(OrderService.class);
//		var order = new OrderService(new PayPalService());
		order.placeOrder();

		var notifyUser = context.getBean(NotificationManager.class);
		notifyUser.sendNotification("Email sent to the user");

		var heavyResource = context.getBean(HeavyResource.class);

		context.close();
	 }

}
