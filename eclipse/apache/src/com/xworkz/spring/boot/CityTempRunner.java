package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CityTempRunner {

	public static void main(String[] args) {
		
		Map<Double, String> city=new TreeMap<Double, String>();
		city.put(1.0D, "jammu");
		city.put(2.0D, "kashmir");
		city.put(3.0D, "srinagar");
		city.put(4.0D, "ladakh");
		city.put(5.0D, "leh");
		city.put(6.0D, "manali");
		city.put(7.0D, "kasol");
		city.put(8.0D, "jispa");
		city.put(9.0D, "rohtang pass");
		city.put(-15.0D, "siyachin");
		System.out.println(city.size());
		System.out.println("accessing keys : ");
		Set<Double> key=city.keySet();
		key.forEach(e->System.out.println(e));
		System.out.println("accessing values : ");
		Collection<String> value=city.values();
		value.forEach(e->System.out.println(e));
		System.out.println("accessing keys & values : ");
		Collection<Entry<Double, String>> entry=city.entrySet();
		entry.forEach(e->System.out.println(e));

	}

}
