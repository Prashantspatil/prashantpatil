package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	private String language;
	private Integer age;
	
	public Actor(@Value("vishnu") String name,@Value("kannada") String language,@Value("57") Integer age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getLanguage() {
		return language;
	}

}
