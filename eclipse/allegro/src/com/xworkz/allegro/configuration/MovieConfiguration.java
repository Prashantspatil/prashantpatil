package com.xworkz.allegro.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.allegro.bean.Engine;

@Configuration
@ComponentScan(basePackages = "com.xworkz.allegro", excludeFilters = {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value = Engine.class)})

public class MovieConfiguration {
	
	public MovieConfiguration() {
		System.out.println("created MovieConfiguration!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
