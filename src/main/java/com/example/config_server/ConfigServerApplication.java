package com.example.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	/*
	 * 
	 * allows a spring application to retrieve its config from spring cloud config server 
	 * when my app start
	 *  => the client contact(tells the server its app name + active profiles) the config server to retrieve config before
	 * the spring app context has fully started
	 * => dynamic updates with zero downtime deployments
	 */

}
