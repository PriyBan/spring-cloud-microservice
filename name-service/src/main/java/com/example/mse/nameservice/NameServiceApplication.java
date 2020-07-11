package com.example.mse.nameservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableConfigurationProperties(NameProperties.class)
@SpringBootApplication
@EnableDiscoveryClient
public class NameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameServiceApplication.class, args);
	}

}
