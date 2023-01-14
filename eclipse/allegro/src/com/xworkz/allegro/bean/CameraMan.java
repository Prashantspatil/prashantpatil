package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	@Autowired
	private Camera camera;
	
	public CameraMan() {
		System.out.println("created cameraman-------");
	}
	
	public void checkCameraMan() {
		System.out.println(this.camera.hashCode() +"hashcode of ref cameraman");
	}

}
