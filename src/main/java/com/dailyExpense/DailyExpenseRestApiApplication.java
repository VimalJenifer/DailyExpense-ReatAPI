package com.dailyExpense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class DailyExpenseRestApiApplication {
	
	private static String REQUEST_DEV_URL= "http://localhost:3000";
	private static String REQUEST_PROD_URL= "https://dailyexpenserestapi.herokuapp.com";

	public static void main(String[] args) {
		SpringApplication.run(DailyExpenseRestApiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/DailyExpense/addExpense").allowedOrigins(REQUEST_DEV_URL);
				registry.addMapping("/DailyExpense/**").allowedOrigins("*").allowedMethods("GET", "POST");				
//				registry.addMapping("/DailyExpense/addExpense").allowedOrigins(REQUEST_PROD_URL);
			}
		};		
	}
}


