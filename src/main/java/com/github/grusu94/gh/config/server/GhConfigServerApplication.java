package com.github.grusu94.gh.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GhConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhConfigServerApplication.class, args);
	}

}
