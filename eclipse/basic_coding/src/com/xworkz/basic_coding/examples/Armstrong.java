package com.xworkz.basic_coding.examples;

public class Armstrong {

	public static void main(String[] args) {
		
		int no=555,rev=0,run,sum=0;
		for(;no!=0;no=no/10) {
			run=no%10;
			int temp=run*run*run;
			rev++;
	
			sum=sum+temp;
			System.out.println(temp);
			System.out.println("the sum is : "+sum);
			System.out.println("count is : "+rev);
		}
		

	}

}
