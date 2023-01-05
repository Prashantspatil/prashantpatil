package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVSLinkedRunner {

	public static void main(String[] args) {
		
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
		        LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 
		        // ArrayList add operation
		        long startTime = System.nanoTime();
		 
		        for (int i = 0; i < 10; i++) {
		        	arrayList.add(i);
		        }
		        long endTime = System.nanoTime();
		        long duration = endTime - startTime;
		        System.out.println("Time Taken by ArrayList in add operation: " + duration);
		        System.out.println(System.lineSeparator());
		        
		        // LinkedList add operation
		        startTime = System.nanoTime();
		 
		        for (int i = 0; i < 10; i++) {
		        	linkedList.add(i);
		        }
		        endTime = System.nanoTime();
		        duration = endTime - startTime;
		        System.out.println("Time Taken by LinkedList in add operation: " + duration);
		        System.out.println(System.lineSeparator());
		        
		        // ArrayList get operation
		        startTime = System.nanoTime();
		 
		        for (int i = 0; i < 10; i++) {
		        	arrayList.get(i);
		        }
		        endTime = System.nanoTime();
		        duration = endTime - startTime;
		        System.out.println("Time Taken by ArrayList in get operation: " + duration);
		        System.out.println(System.lineSeparator());

		        // LinkedList get operation
		        startTime = System.nanoTime();
		 
		        for (int i = 0; i < 10; i++) {
		        	linkedList.get(i);
		        }
		        endTime = System.nanoTime();
		        duration = endTime - startTime;
		        System.out.println("Time Taken by LinkedList in get operation: " + duration);
		        System.out.println(System.lineSeparator());

		        // ArrayList remove operation
		        startTime = System.nanoTime();
		 
		        for (int i = 9; i >=0; i--) {
		        	arrayList.remove(i);
		        }
		        endTime = System.nanoTime();
		        duration = endTime - startTime;
		        System.out.println("Time Taken by ArrayList in remove operation:  " + duration);
		        System.out.println(System.lineSeparator());

		        // LinkedList remove operation
		        startTime = System.nanoTime();
		 
		        for (int i = 9; i >=0; i--) {
		        	linkedList.remove(i);
		        }
		        endTime = System.nanoTime();
		        duration = endTime - startTime;
		        System.out.println("Time Taken by LinkedList in remove operation: " + duration);

	}

}
