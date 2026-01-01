package com.projects.ecommerce;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class EcommerceApplication {

    @Autowired
    private Environment env;  // Inject Spring Environment

    @PostConstruct
    public void showEnv() {
        System.out.println("Active Profiles: " + Arrays.toString(env.getActiveProfiles()));
        System.out.println("DB URL: " + env.getProperty("DB_URL"));
    }
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
