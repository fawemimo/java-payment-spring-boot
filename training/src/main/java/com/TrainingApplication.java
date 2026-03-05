package com;

import com.excerise.EmailNotificationService;
import com.excerise.HeavyResource;
import com.excerise.NotificationManager;
import com.excerise3.User;
import com.excerise3.UserService;
import com.store.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TrainingApplication {

	 static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(TrainingApplication.class, args);
//		var order = context.getBean(OrderService.class);
//		var order = new OrderService(new PayPalService());
//		order.placeOrder();

//		var notifyUser = context.getBean(NotificationManager.class);
//		notifyUser.sendNotification("Email sent to the user");
//
//		var heavyResource = context.getBean(HeavyResource.class);
//
//		context.close();
		 var user = new User("BigDam@gmail.com","passW@7d", "BigDam");
		 System.out.println("User service is been called");
		 var regUser = context.getBean(UserService.class);
		 regUser.registerUser(user);
	 }

}
