package com.xworkz.bunk.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public Chrome() {
		System.out.println("created chrome using const...");
	}

	@Override
	public void browse(Provider provider) {
		System.out.println("browse gir girr");
		
	}
	
}
