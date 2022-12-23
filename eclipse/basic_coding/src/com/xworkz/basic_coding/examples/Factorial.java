package com.xworkz.basic_coding.examples;

public class Factorial {

	public static void main(String[] args) {
		
		int i,fact=1,n=6;
		for (i = 0; i <=n ; i++) {
			fact=fact*1;
		}
         System.out.println(fact);
         int a=10,b=20;
         System.out.println("a before : "+a);
         System.out.println("b before : "+b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("a after : "+a);
         System.out.println("b after : "+b);
	}

}
