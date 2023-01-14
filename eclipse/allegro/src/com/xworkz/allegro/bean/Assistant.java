package com.xworkz.allegro.bean;

import org.springframework.stereotype.Component;

@Component
public class Assistant {
	
	private String assistantName;
	
	public Assistant() {
		System.out.println("created assistant");
	}

}
