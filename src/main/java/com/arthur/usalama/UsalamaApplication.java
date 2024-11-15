package com.arthur.usalama;

import com.arthur.usalama.security.ApplicationSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsalamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{UsalamaApplication.class, ApplicationSecurityConfig.class}, args);
	}

}
