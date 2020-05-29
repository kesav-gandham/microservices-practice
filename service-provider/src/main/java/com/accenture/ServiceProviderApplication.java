package com.accenture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceProviderApplication {

	@Value("${service-provider.instance.name}")
	private String instance;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}

	
	@GetMapping
	public String message() {
		return "hello ! "+ instance;
	}
}
