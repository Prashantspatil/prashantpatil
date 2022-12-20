package com.xworkz.basic_coding.examples;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		System.out.println(s1);
		System.out.println(s2);
		for(int i=s1;i<=s2;i++) {
			System.out.println("s1 = "+i +"s2 = "+i);
			int temp=i;
			System.out.print(" "+temp);
			int count=0;
			for(;temp!=0;temp=temp/10) {
				count++;
			}
			int n=temp;
			int first=0;
			int sum=0;
			for(;n>0;n=n/10) {
				first=n%10;
				sum+=(int)Math.pow(first, count);
				count--;
			}
			if(n==sum) {
				System.out.println(n + " ");
			}
		}

	}

}
