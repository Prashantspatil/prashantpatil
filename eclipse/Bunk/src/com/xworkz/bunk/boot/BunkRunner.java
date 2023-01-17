package com.xworkz.bunk.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bunk.configuration.ConfigConfiguration;
import com.xworkz.bunk.things.PetrolBunk;

public class BunkRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(ConfigConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		PetrolBunk bunk=container.getBean(PetrolBunk.class);
		bunk.purchase();

	}

}
