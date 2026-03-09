package com;

import com.entities.Address;
import com.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	static void main(String[] args) {

//		 SpringApplication.run(TrainingApplication.class, args);
		var user = User.builder().name("Gospel").password("password").email("gospel@interswitchng.com").build();

		var address = Address.builder()
				.street("Fola-Agoro")
				.city("Shomolu")
				.state("Lagos")
				.zip("10001")
				.build();

		user.getAddresses().add(address);
		address.setUser(user);
		System.out.println("User Detail : "+ user);

	}

}
