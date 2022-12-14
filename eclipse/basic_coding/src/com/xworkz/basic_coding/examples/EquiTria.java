package com.xworkz.basic_coding.examples;

public class EquiTria {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("1");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}

	}

}
