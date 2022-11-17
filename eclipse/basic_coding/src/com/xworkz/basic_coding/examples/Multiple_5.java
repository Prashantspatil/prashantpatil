package com.xworkz.basic_coding.examples;

public class Multiple_5 {

	public static void main(String[] args) {
		
		int num = 222, count = 0, temp, n;
		n = num;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
		temp = (int) Math.pow(5, count);
		System.out.println(temp);
		int b = temp * num;
		System.out.println(b);

	}

}
