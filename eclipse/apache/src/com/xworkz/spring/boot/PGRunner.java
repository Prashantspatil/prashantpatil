package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PGRunner {
	
	public static void main(String[] args) {
		
		Map<String, Double> pg=new HashMap<String, Double>();
		pg.put("comfort-zone", 5D);
		pg.put("mallige", 6D);
		pg.put("laxmi", 7D);
		pg.put("maruthi", 8D);
		pg.put("shruti", 9D);
		pg.put("slv", 10D);
		pg.put("manjunath", 4D);
		pg.put("rudra", 3D);
		pg.put("jagadeesh", 3.5D);
		pg.put("jaideep", 6.5D);
		System.out.println(pg.size());
		System.out.println("accessing keys : ");
		Set<String> key=pg.keySet();
		key.forEach(e->System.out.println(e));
		System.out.println("accessing values : ");
		Collection<Double> value=pg.values();
		value.forEach(e->System.out.println(e));
		System.out.println("accessing keys & values : ");
		Set<Entry<String, Double>> entry=pg.entrySet();
		entry.forEach(e->System.out.println(e));

	}

}
