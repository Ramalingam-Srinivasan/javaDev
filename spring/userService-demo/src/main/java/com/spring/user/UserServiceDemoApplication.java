package com.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.spring.user")
public class UserServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceDemoApplication.class, args);
	}

}
