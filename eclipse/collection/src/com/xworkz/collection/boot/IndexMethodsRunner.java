package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;

public class IndexMethodsRunner {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.add(2, 50);//this relocate value
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println(System.lineSeparator());
		list.set(1, 60);//this replace value
		list.remove(4);
		for (Integer integer1 : list) {
			System.out.println(integer1);
		}
		System.out.println(System.lineSeparator());
		Integer integer2=list.get(3);
		System.out.println("index value of 3 : "+integer2);
	}

}
