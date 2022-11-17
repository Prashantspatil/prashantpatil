package com.xworkz.basic_coding.examples;

public class ArrayCount {

	public static void main(String[] args) {
				String name = "this time shall pass";
				int count = 0;
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) != ' ') {
						count++;
					}
				}
				System.out.println("Total Count-"+count);

			}

}
