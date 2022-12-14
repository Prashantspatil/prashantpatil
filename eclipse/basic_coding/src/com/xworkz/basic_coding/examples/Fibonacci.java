package com.xworkz.basic_coding.examples;

public class Fibonacci {

	public static void main(String[] args) {
		
		int no=20;
		int a=0, b=1;
		System.out.println(a + " , " + b + " , ");
		int nextNo;
		for(int i=2;i<no; i++) {
			nextNo=a+b;
			a=b;
			b=nextNo;
			System.out.println(nextNo);
		}

	}

}
