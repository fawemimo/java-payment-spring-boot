package com;

import com.entities.Address;
import com.entities.Profile;
import com.entities.Tag;
import com.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingApplication {

	static void main(String[] args) {

		 ApplicationContext context =  SpringApplication.run(TrainingApplication.class, args);
//		var user = User.builder().name("Gospel").password("password").email("gospel@interswitchng.com").build();

//		var address = Address.builder()
//				.street("Fola-Agoro")
//				.city("Shomolu")
//				.state("Lagos")
//				.zip("10001")
//				.build();
//
//		user.getAddresses().add(address);
//		address.setUser(user);

//		user.addTag("TAG 1");

//		var profile = Profile.builder().bio("I love to watch football").build();
//		user.setProfile(profile);
//		profile.setUser(user);
//		System.out.println("User Detail : "+ user);


	}

}
