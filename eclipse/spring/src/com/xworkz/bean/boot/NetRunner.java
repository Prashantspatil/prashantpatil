package com.xworkz.bean.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.configuration.MonitorConfiguration;
import com.xworkz.bean.things.Keyboard;

public class NetRunner {

	public static void main(String[] args) {
		
		ApplicationContext shop=new AnnotationConfigApplicationContext(MonitorConfiguration.class);
		Keyboard ref=shop.getBean(Keyboard.class);
		System.out.println(ref);
		String ref2=shop.getBean("dell",String.class);
		System.out.println(ref2);

	}

}
