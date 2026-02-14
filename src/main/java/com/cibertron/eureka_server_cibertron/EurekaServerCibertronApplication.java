package com.cibertron.eureka_server_cibertron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCibertronApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerCibertronApplication.class, args);
	}

}
