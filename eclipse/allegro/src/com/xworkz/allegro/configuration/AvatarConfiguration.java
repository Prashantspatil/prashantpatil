package com.xworkz.allegro.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.allegro")
public class AvatarConfiguration {
	
	@Bean
	public String newsPaperName() {
		return "vijay vani";
	}
	
	@Bean
	public String newsPaperOwnerName() {
		return "vijay";
	}
	
	@Bean
	public String engineName() {
		return "yyy";
	}
	
	@Bean
	public String company() {
		return "kirloskar";
	}
	
	@Bean
	public String engineType() {
		return "diesel";
	}
	
	@Bean
	public String snakeName() {
		return "cobra";
	}
	
	@Bean
	public String snakeType() {
		return "venomous";
	}
	
	@Bean
	public boolean poisonous() {
		return true;
	}
	
	@Bean
	public LocalDate ghostDOB() {
		return LocalDate.now();
	}
	
	@Bean
	public LocalDate ghostDOD() {
		return LocalDate.now();
	}
	
	@Bean
	public String ghostQualification() {
		return "BE";
	}
	
	@Bean
	public String ghostCollege() {
		return "ipl";
	}
	
	@Bean
	public String ghostFriend() {
		return "mellon";
	}
	
	@Bean
	public String ghostArea() {
		return "vijaynagar";
	}
	
	@Bean
	public long ghostPinCode() {
		return 560040L;
	}
	
	@Bean
	public boolean ghostDangerous() {
		return true;
	}
	
	@Bean
	public String ghostTime() {
		return "night";
	}
	
	@Bean
	public boolean ghostCommitted() {
		return true;
	}
	
}
