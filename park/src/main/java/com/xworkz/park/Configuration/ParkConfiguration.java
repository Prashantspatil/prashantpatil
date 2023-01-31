package com.xworkz.park.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.park")
public class ParkConfiguration {
	
	public ParkConfiguration() {
		System.out.println("created ParkConfiguration");
	}

}
