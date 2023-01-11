package com.xworkz.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.things.Actor;
import com.xworkz.bean.things.Rocket;
import com.xworkz.bean.things.Season;

@Configuration
@ComponentScan("com.xworkz.bean")
public class BeanConfiguration {

	@Bean
	public Rocket getRocket() {
		System.out.println("pslv Kelige benki");
		Rocket pslv = new Rocket();
		pslv.getCountry();
		return pslv;
	}
	
	@Bean
	public Actor movie() {
		System.out.println("picture abhi bhaki hain");
		Actor actor=new Actor("bachchan","hindi",80);
		return actor;
	}
	
	@Bean
	public Season mausum() {
		Season season =new Season();
		season.setName("autumn");
		season.setDuration(2);
		season.setMonth("april");
		return season;
	}
	
}
