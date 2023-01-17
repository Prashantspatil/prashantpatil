package com.xworkz.bunk.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bunk.configuration.ConfigConfiguration;
import com.xworkz.bunk.things.Browser;

public class BrowseRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(ConfigConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		container.getBean("chrome",Browser.class);
		container.getBean("fireBox",Browser.class);

	}

}
