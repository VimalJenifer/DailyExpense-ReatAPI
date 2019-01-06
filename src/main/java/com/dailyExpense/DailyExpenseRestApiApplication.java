package com.dailyExpense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class DailyExpenseRestApiApplication {
	
	private static String REQUEST_URL= "http://localhost:9000";

	public static void main(String[] args) {
		SpringApplication.run(DailyExpenseRestApiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/DailyExpense/Register1").allowedOrigins(REQUEST_URL);
			}
		};		
	}
}


