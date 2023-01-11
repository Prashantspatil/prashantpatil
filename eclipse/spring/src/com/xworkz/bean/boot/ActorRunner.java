package com.xworkz.bean.boot;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.configuration.BeanConfiguration;
import com.xworkz.bean.things.Actor;
import com.xworkz.bean.things.Rocket;
import com.xworkz.bean.things.Season;

public class ActorRunner {

	public static void main(String[] args) {

		ApplicationContext qq = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//bean from meta-info
		Actor ref1 = qq.getBean("movie", Actor.class);
		System.out.println(ref1.getName());
		System.out.println(ref1.getAge());
		System.out.println(ref1.getLanguage());

		//bean from configuration
		Actor ref2 = qq.getBean("actor", Actor.class);
		System.out.println(ref2.getName());
		System.out.println(ref1.getAge());
		System.out.println(ref1.getLanguage());
		
		//bean from meta-info
		Rocket ref3=qq.getBean("getRocket", Rocket.class);
		System.out.println(ref3.getName());
		System.out.println(ref3.getCountry());
		System.out.println(ref3.getBudget());
		
		//bean from configuration
		Rocket ref4=qq.getBean("rocket", Rocket.class);
		System.out.println(ref4.getName());
		System.out.println(ref4.getCountry());
		System.out.println(ref4.getBudget());
		
		//bean from meta-info
		Season ref5=qq.getBean("mausum",Season.class);
		System.out.println(ref5);
		System.out.println(ref5.getName());
		System.out.println(ref5.getDuration());
		System.out.println(ref5.getMonth());
		
		//bean from configuration
		Season ref6=qq.getBean("season", Season.class);
		System.out.println(ref6);
		System.out.println(ref6.getName());
		System.out.println(ref6.getDuration());
		System.out.println(ref6.getMonth());

	}

}
