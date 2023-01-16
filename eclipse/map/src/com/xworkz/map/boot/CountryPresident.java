package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class CountryPresident {

	public static void main(String[] args) {
		
		Map<String, String> presidentMap=new TreeMap<String, String>((a,b)->a.compareTo(b));
		presidentMap.put("india", "draupadi murmu");
		presidentMap.put("usa", "joe biden");
		presidentMap.put("china", "xi jinping");
		presidentMap.put("kazakhstan", "kassym jomart kemeluly tokayev");
		presidentMap.put("iran", "hassan rouhani");
		presidentMap.put("mongolia", "khaltmaagiin battulga");
		presidentMap.put("indonesia", "joko widodo");
		presidentMap.put("pakistan", "arif alvi");
		presidentMap.put("turkey", "recep tayyip erdogan");
		presidentMap.put("afghanistan", "mohammad hassan akhund");
		presidentMap.put("yemen", "mahdi almashat");
		presidentMap.put("turkmenistan", "serdar berdimuhamedow");
		presidentMap.put("uzbekistan", "shavkat mirziyoyev");
		presidentMap.put("iraq", "abdul latif rashid");
		presidentMap.put("vietnam", "nguyen xuan phuc");
		presidentMap.put("philippines", "bongbong marcos");
		presidentMap.put("laos", "thongloun sisoulith");
		presidentMap.put("kyrgyzstan", "sadyr japarov");
		presidentMap.put("syria", "bashar alassad");
		presidentMap.put("bangladesh", "abdul hamid");
		System.out.println(presidentMap.size());
		presidentMap.forEach((key,value)->{System.out.println("key : " + key + " value : " + value);
		if(key.length()>=10) {
			presidentMap.replace(key, "prashant");
			System.out.println("new key "+key+" values "+value);}
		});
           System.out.println("new map");
	presidentMap.forEach((a1,a2)->System.out.println(a1+" "+a2));
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@222");
	boolean map=presidentMap.containsKey("usa");
	System.out.println("contains="+map);
	boolean map2=presidentMap.containsKey("joe biden");
	System.out.println("contains="+map2);
	presidentMap.forEach((key,value)->System.out.println("key : " + key + " value : " + value));
	System.out.println(presidentMap.size());
	}
}
