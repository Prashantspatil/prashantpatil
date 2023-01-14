package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	private int lens;
	@Autowired
	private Battery battery;
	
	public Camera() {
		System.out.println("created camera--------");
	}
	
	public void checkBattery() {
		System.out.println(this.battery.hashCode() +"hashcode of ref battery");
	}

}
