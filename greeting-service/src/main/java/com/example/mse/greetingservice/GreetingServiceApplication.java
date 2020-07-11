package com.example.mse.greetingservice;

import org.springframework.cloud.sleuth.sampler.SamplerAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
@EnableDiscoveryClient
public class GreetingServiceApplication {



	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceApplication.class, args);
	}

}
