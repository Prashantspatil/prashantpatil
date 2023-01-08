package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Temple;

public class CycleRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Cycle ref=spring.getBean(Cycle.class);
		System.out.println(ref);
		System.out.println(spring);
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Girl ref1=spring.getBean(Girl.class);
		System.out.println(ref);
		System.out.println(spring1);

		ApplicationContext spring2=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Application ref2=spring2.getBean(Application.class);
		System.out.println(ref2);
		System.out.println(spring2);
		
		ApplicationContext spring3=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Area ref3=spring3.getBean(Area.class);
		System.out.println(ref3);
		System.out.println(spring3);
		ApplicationContext spring4=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Chocolate ref4=spring4.getBean(Chocolate.class);
		System.out.println(ref4);
		System.out.println(spring4);
		ApplicationContext spring5=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		City ref5=spring5.getBean(City.class);
		System.out.println(ref5);
		System.out.println(spring5);
		ApplicationContext spring6=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Fish ref6=spring6.getBean(Fish.class);
		System.out.println(ref6);
		System.out.println(spring6);
		ApplicationContext spring7=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		God ref7=spring7.getBean(God.class);
		System.out.println(ref7);
		System.out.println(spring7);
		
		ApplicationContext spring8=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Mall ref8=spring8.getBean(Mall.class);
		System.out.println(ref8);
		System.out.println(spring8);

		ApplicationContext spring9=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Mask ref9=spring9.getBean(Mask.class);
		System.out.println(ref9);
		System.out.println(spring9);

		ApplicationContext spring10=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Milk ref10=spring10.getBean(Milk.class);
		System.out.println(ref10);
		System.out.println(spring10);

		ApplicationContext spring11=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Park ref11=spring11.getBean(Park.class);
		System.out.println(ref1);
		System.out.println(spring11);

		ApplicationContext spring12=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Patient ref12=spring12.getBean(Patient.class);
		System.out.println(ref12);
		System.out.println(spring12);

		ApplicationContext spring13=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Temple ref13=spring13.getBean(Temple.class);
		System.out.println(ref13);
		System.out.println(spring13);

	}

}
