package com.xworkz.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.fi")
@Configuration
public class FiConfiguration {
	
	public FiConfiguration() {
		System.out.println("created : "+this.getClass().getSimpleName());
	}

}
