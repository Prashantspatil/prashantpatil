package com.xworkz.bean.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ConfigurationClass {
	
	@Bean
	public int id() {
		return 6;
	}
	
	@Bean
	public String name() {
		return "pooja";
	}
	
	@Bean
	public String gstNo() {
		return "6xxxx7yyyy";
	}
	
	@Bean
	public String ownerName() {
		return "abhi";
	}
	
	@Bean
	public String address() {
		return "vijayanagar";
	}
	
	@Bean
	public String sname() {
		return "google";
	}
	
	@Bean
	public double version() {
		return 6.6;
	}
	
	@Bean
	public String developer() {
		return "priyanka";
	}
	
	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}
	
	@Bean
	public boolean free() {
		return true;
	}
	
	@Bean
	public String engineer() {
		return "prashant";
	}
	
	@Bean
	public double salary() {
		return 6.5;
	}
	
	@Bean
	public String company() {
		return "xxx";
	}
	
	@Bean
	public double experience() {
		return 2.0;
	}
	
	@Bean
	public String pencilName() {
		return "apsar";
	}
	
	@Bean
	public String pencilType() {
		return "sketch";
	}
	
	@Bean
	public String pencilColor() {
		return "pink";
	}
	
	@Bean
	public int pencilPrice() {
		return 5;
	}
	
	@Bean
	public boolean pencilSharp() {
		return true;
	}
	
	@Bean
	public boolean pencilStolen() {
		return false;
	}
	
	@Bean
	public String eraser() {
		return "cello";
	}
	
	@Bean
	public String variety() {
		return "eco";
	}
	
	@Bean
	public int kaasu() {
		return 5;
	}
	
	@Bean
	public String banna() {
		return "white";
	}
	
	@Bean
	public boolean chored() {
		return false;
	}
	
	@Bean
	public String shape() {
		return "cuboid";
	}
	
	@Bean
	public String size() {
		return "small";
	}
	
	@Bean
	public String hesaru() {
		return "mallan";
	}
	
	@Bean
	public byte hands() {
		return 2;
	}
	
	@Bean
	public short teeth() {
		return 32;
	}
	
	@Bean
	public int bones() {
		return 206;
	}
	
	@Bean
	public long mobileNo() {
		return 7349098L;
	}
	
	@Bean
	public char bloodGroup() {
		return 'B';
	}
	
	@Bean
	public boolean smart() {
		return true;
	}
	
	@Bean
	public float height() {
		return 169.00F;
	}
	
	@Bean
	public double weight() {
		return 55.00;
	}

}
