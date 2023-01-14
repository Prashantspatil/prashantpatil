package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;
	@Autowired
	private Producer producer;
	
	public Movie() {
		System.out.println("created movie@@@@@@@@@@@@@@@@@@22222");
	}
	
	public void checkDirector() {
		System.out.println(this.director.hashCode() +"hashcode of ref director");
	}
	
	public void checkCameraMan() {
		System.out.println(this.cameraMan.hashCode() +"hashcode of ref cameraman");
	}
	
	public void checkProducer() {
		System.out.println(this.producer.hashCode() +"hashcode of ref producer");
	}

}
