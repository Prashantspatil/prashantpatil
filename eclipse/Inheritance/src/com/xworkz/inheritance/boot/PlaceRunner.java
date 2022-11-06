package com.xworkz.inheritance.boot;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import com.xworkz.inheritance.things.*;

public class PlaceRunner {

	public static void main(String[] args) {
		
		Place place=new Place();
		Object object=new Place();
		
		System.out.println(System.lineSeparator());
		Place capital=new Capital();
		Capital capital2=new Capital();
		Object capital3=new Capital();
		
		System.out.println(System.lineSeparator());
		Place city=new City();
		Capital city2=new City();
		City city3=new City();
		Object city4=new City();
		
		System.out.println(System.lineSeparator());
		Place metroCity=new MetroCity();
		Capital metroCity2=new MetroCity();
		City metroCity3=new MetroCity();
		MetroCity metroCity4=new MetroCity();
		Object metroCity5=new MetroCity();
		
		System.out.println(System.lineSeparator());
		Place siliconCity=new SiliconCity();
		Capital siliconCity2=new SiliconCity();
		City siliconCity3=new SiliconCity();
		MetroCity siliconCity4=new SiliconCity();
		SiliconCity siliconCity5=new SiliconCity();
		Object siliconCity6=new SiliconCity();
		
		System.out.println(System.lineSeparator());
		Place bengaluru=new Bengaluru();
		Capital bengaluru2=new Bengaluru();
		City bengaluru3=new Bengaluru();
		MetroCity bengaluru4=new Bengaluru();
		SiliconCity bengaluru5=new Bengaluru();
		Bengaluru bengaluru6=new Bengaluru();
		Object bengaluru7=new Bengaluru();

	}

}
