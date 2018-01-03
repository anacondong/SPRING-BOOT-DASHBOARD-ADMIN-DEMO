package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientApplication {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/")
    public String getName() {
        return name;
    }

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
