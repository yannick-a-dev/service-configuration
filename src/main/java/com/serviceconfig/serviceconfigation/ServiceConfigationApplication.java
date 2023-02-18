package com.serviceconfig.serviceconfigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServiceConfigationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigationApplication.class, args);
	}

}
