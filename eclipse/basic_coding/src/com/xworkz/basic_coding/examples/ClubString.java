package com.xworkz.basic_coding.examples;

public class ClubString {

	public static void main(String[] args) {
		
		String s1 = new String("Ravi");
		String s2 = new String("Teja");
		String s = String.join("", s1,s2);
		System.out.println(s.toString());

	}

}
