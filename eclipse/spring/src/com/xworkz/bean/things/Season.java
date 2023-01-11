package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private Integer duration;
	private String month;
	
	public Season() {
		System.out.println("chali chali");
	}
	
	public String getName() {
		return name;
	}
	
	@Value("summer")
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	@Value("3")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public String getMonth() {
		return month;
	}
	
	@Value("march")
	public void setMonth(String month) {
		this.month = month;
	}

}
