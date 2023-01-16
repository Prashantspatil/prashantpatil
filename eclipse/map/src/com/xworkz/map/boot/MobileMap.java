package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class MobileMap {

	public static void main(String[] args) {

		Map<String, Integer> cell = new TreeMap<String, Integer>((c1, c2) -> c2.compareTo(c1));
		cell.put("oneplus", 33000);
		cell.put("apple", 50000);
		cell.put("nokia", 1200);
		cell.put("vivo", 15000);
		cell.put("redme", 8000);
		cell.put("asar", 13000);
		cell.put("oppo", 7500);
		cell.put("samsung", 55000);
		cell.put("htc", 45000);
		cell.put("realme", 5000);

		cell.forEach((x, y) -> System.out.println(x.toUpperCase() + "=" + y));
		System.out.println(System.lineSeparator());
		cell.forEach((mobile, price) -> {
			if (price > 10000) {
				System.out.println(mobile + "=" + price);
			}
		});
		System.out.println(System.lineSeparator());
		cell.forEach((key, value) -> {
			if (key.length() < 5) {
				System.out.println(key + "=" + value);
			}
		});
	}

}
