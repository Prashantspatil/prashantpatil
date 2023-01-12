package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private String type;
	@Value("1")
	private int number;
	@Value("top-end")
	private String version;
	private String company;
	private int strokes;
	
	@Autowired
	public Engine(@Qualifier("engineName")String name,@Qualifier("engineType") String type,@Qualifier("company") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Value("4")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	
	public int getStrokes() {
		return strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

}
