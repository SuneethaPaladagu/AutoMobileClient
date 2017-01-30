package com.nisum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nisum")
public class AutoMobilesCloudClienTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMobilesCloudClienTestApplication.class, args);
	}
}
