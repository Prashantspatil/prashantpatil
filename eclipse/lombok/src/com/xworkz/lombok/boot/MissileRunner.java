package com.xworkz.lombok.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lombok.configuration.SpringConfiguration;
import com.xworkz.lombok.dto.MissileDTO;
import com.xworkz.lombok.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service=container.getBean(MissileService.class);
		
		boolean saved=service.validateAndSave(new MissileDTO());
		System.out.println("saved"+saved);

	}

}
