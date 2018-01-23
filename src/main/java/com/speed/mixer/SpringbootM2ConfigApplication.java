package com.speed.mixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootM2ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM2ConfigApplication.class, args);
	}
}
