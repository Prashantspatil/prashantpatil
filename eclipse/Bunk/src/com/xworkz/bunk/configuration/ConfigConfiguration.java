package com.xworkz.bunk.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bunk")
public class ConfigConfiguration {
	
	public ConfigConfiguration() {
		System.out.println("created ConfigConfiguration");
	}
	
}
