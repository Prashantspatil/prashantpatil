package com.xworkz.allegro.runner;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.allegro.bean.Engine;
import com.xworkz.allegro.bean.Ghost;
import com.xworkz.allegro.bean.NewsPaper;
import com.xworkz.allegro.bean.Snake;
import com.xworkz.allegro.configuration.AvatarConfiguration;

public class AvatarRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(AvatarConfiguration.class);
		String[] beans=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		NewsPaper paper=container.getBean(NewsPaper.class);
		System.out.println(paper.toString());
		
		Engine yantra=container.getBean(Engine.class);
		System.out.println(yantra.toString());
		
		Snake haavu=container.getBean(Snake.class);
		System.out.println(haavu.toString());
		
		Ghost bhoota=container.getBean(Ghost.class);
		System.out.println(bhoota.toString());

	}

}
