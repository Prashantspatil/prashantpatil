package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class CricketerMap {

	public static void main(String[] args) {
		
		Map<String, Integer> runs=new TreeMap<String, Integer>((p1,p2)->p2.compareTo(p1));
		runs.put("sachin", 18000);
		runs.put("pointing", 13000);
		runs.put("kallis", 12000);
		runs.put("jayasurya", 11000);
		runs.put("rohit", 9000);
		runs.forEach((batsman,totalRuns)->System.out.println("batsman : "+batsman+" runs : "+totalRuns));
		runs.forEach((bat,run)->{
			if(run<10000) {
				System.out.println(bat+"="+run);
			}
		});

	}

}
