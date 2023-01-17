package com.xworkz.bunk.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	public FireBox() {
		System.out.println("created firebox using const...");
	}
	
	@Override
	public void browse(Provider provider) {
		provider.connect();
		System.out.println("running browse in firebox");
	}

}
