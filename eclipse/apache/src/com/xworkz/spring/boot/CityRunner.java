package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityRunner {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("shahapur", "585223");
		map.put("kalaburgi", "585102");
		map.put("yadgir", "585222");
		map.put("shorapur", "585224");
		map.put("jewargi", "585225");
		map.put("sedam", "585226");
		map.put("aland", "585227");
		map.put("chittapur", "585228");
		map.put("afzalpur", "585229");
		map.put("bidar", "585300");
		
		System.out.println(map.size());
		System.out.println("accessing keys : ");
		Set<String> key=map.keySet();
		key.forEach(e->System.out.println(e));
		System.out.println("accessing values : ");
		Collection<String> value=map.values();
		value.forEach(e->System.out.println(e));
		System.out.println("accessing keys & values : ");
		Set<Entry<String, String>> entry=map.entrySet();
		entry.forEach(e->System.out.println(e));

	}

}
