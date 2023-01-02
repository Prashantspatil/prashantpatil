package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.CakeDto;

public class Cakerunner {

	public static void main(String[] args) {
		
		CakeDto cakeDto1=new CakeDto("honey cake", 5, "yellow", "cube");
		CakeDto cakeDto2=new CakeDto("honey cake", 5, "yellow", "cube");

		Set<CakeDto> set=new LinkedHashSet<CakeDto>();
		set.add(cakeDto2);
		set.add(cakeDto1);
		
		for (CakeDto cakeDto : set) {
			System.out.println(cakeDto);
			System.out.println("overriden : "+cakeDto.hashCode());
			System.out.println("original : "+System.identityHashCode(cakeDto));
		}
		System.out.println(System.lineSeparator());
		//sort
		Set<String> set1=new TreeSet();
		set1.add("prashant");
		set1.add("mallan");
		set1.add("abhi");
		set1.add("vins");
		set1.add("prashant");//no duplicate counted
		
		System.out.println(set1.size());
		for (String string : set1) {
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		List<String> list=new ArrayList<String>();
		list.add("p");
		list.add("q");
		list.add("r");
		list.add("s");
		list.add("t");
		//listIterator interface child of Iterator
		ListIterator<String> listIterator=list.listIterator(2);//index backward approach
		while (listIterator.hasPrevious()) {
			String element = (String) listIterator.previous();
			System.out.println("backward approach : "+element);
		}
		ListIterator<String> listIterator1=list.listIterator(2);//index forward approach
		while (listIterator1.hasNext()) {
			String element1 = (String) listIterator1.next();
			System.out.println("forward approach : "+element1);
		}
	}

}
