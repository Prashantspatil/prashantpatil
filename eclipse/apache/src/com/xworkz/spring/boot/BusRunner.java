package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Bus;

public class BusRunner {

	public static void main(String[] args) {

           ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
           Bus ref=spring.getBean(Bus.class);
           String string= spring.getDisplayName();
            System.out.println(string+"Name");
           System.out.println(ref);
           System.out.println(spring);

	}

}
