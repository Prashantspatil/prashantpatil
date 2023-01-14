package com.xworkz.allegro.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.allegro.bean.Battery;
import com.xworkz.allegro.bean.Camera;
import com.xworkz.allegro.bean.CameraMan;
import com.xworkz.allegro.bean.Companies;
import com.xworkz.allegro.bean.Director;
import com.xworkz.allegro.bean.Experience;
import com.xworkz.allegro.bean.Location;
import com.xworkz.allegro.bean.Movie;
import com.xworkz.allegro.bean.Producer;
import com.xworkz.allegro.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Movie movie=container.getBean(Movie.class);
		movie.checkCameraMan();
		movie.checkDirector();
		movie.checkProducer();

	}

}
