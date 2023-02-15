package com.xworkz.casino.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class CasinoConfig {
	
	public CasinoConfig() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}

}
