package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Value("5.5")
	private double length;
	@Value("green")
	private String color;
	private String type;
	private boolean poisonous;
	
	@Autowired
	public Snake(@Qualifier("snakeName")String name,@Qualifier("snakeType") String type,@Qualifier("poisonous") boolean poisonous) {
		super();
		this.name = name;
		this.type = type;
		this.poisonous = poisonous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}

}
