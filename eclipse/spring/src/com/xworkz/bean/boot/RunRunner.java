package com.xworkz.bean.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.configuration.ConfigurationClass;
import com.xworkz.bean.things.HardwareShop;
import com.xworkz.bean.things.Pencil;
import com.xworkz.bean.things.Rubber;
import com.xworkz.bean.things.Software;
import com.xworkz.bean.things.SoftwareEngineer;
import com.xworkz.bean.things.YourWish;

public class RunRunner {

	public static void main(String[] args) {
		
		ApplicationContext container= new AnnotationConfigApplicationContext(ConfigurationClass.class);
		String[] beans=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		System.out.println("=========================\n");
		HardwareShop entry=container.getBean(HardwareShop.class);
		System.out.println(entry.toString());
		System.out.println("=========================\n");
		
		Software entry2=container.getBean(Software.class);
		System.out.println(entry2.toString());
		System.out.println("=========================\n");
		
		SoftwareEngineer entry3=container.getBean(SoftwareEngineer.class);
		System.out.println(entry3.toString());
		System.out.println("=========================\n");
		
		Pencil entry4=container.getBean(Pencil.class);
		System.out.println(entry4.toString());
		System.out.println("=========================\n");
		
		Rubber entry5=container.getBean(Rubber.class);
		System.out.println(entry5.toString());
		System.out.println("=========================\n");
		
		YourWish entry6=container.getBean(YourWish.class);
		System.out.println(entry6.toString());

	}

}
