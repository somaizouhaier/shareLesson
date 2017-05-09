package com.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.entity.User;
import com.project.repository.UserRepository;

@SpringBootApplication
public class ShareLessonAppApplication {

	private static final Logger log = LoggerFactory
			.getLogger(ShareLessonAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ShareLessonAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
			 repository.save(new User("Jack", "Bauer"));
			 repository.save(new User("Chloe", "O'Brian"));
			 repository.save(new User("Kim", "Bauer"));
			 repository.save(new User("David", "Palmer"));
			 repository.save(new User("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			// for (User user : repository.findAll()) {
			// log.info(user.toString());
			// }
			log.info("");

			// fetch an individual customer by ID
			//User user = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			//log.info(user.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (User bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}

}
