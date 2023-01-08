package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Map<String, Double> chocobar=new LinkedHashMap<String, Double>();
		chocobar.put("parle", 0.5D);
		chocobar.put("alpenlibi", 1D);
		chocobar.put("kit-kat", 5D);
		chocobar.put("peark", 10D);
		chocobar.put("dairy-milk", 15D);
		chocobar.put("nestle", 25D);
		chocobar.put("milkybar", 35D);
		chocobar.put("godiva", 45D);
		chocobar.put("amul", 55D);
		chocobar.put("almond", 65D);
		System.out.println(chocobar.size());
		System.out.println("accessing keys : ");
		Set<String> key=chocobar.keySet();
		key.forEach(e->System.out.println(e));
		System.out.println("accessing values : ");
		Collection<Double> value=chocobar.values();
		value.forEach(e->System.out.println(e));
		System.out.println("accessing keys & values : ");
		Set<Entry<String, Double>> entry=chocobar.entrySet();
		entry.forEach(e->System.out.println(e));

	}

}
