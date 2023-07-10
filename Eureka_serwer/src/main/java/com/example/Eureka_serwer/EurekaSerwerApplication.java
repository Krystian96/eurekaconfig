package com.example.Eureka_serwer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekaSerwerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSerwerApplication.class, args);
	}

}
