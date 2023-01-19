package com.xworkz.lombok.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lombok.configuration.SpringConfiguration;
import com.xworkz.lombok.dto.FirstAidDTO;
import com.xworkz.lombok.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service=container.getBean(FirstAidService.class);
		
		boolean saved=service.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+saved);

	}

}
