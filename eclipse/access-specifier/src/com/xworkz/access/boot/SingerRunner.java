package com.xworkz.access.boot;

import com.xworkz.access.things.Balasubramanya;
import com.xworkz.access.things.Singer;

public class SingerRunner {

	public static void main(String[] args) {
		
		Singer singer=new Singer();
		Balasubramanya balasubramanya=new Balasubramanya(12.00, 75, "01/01", 40.00, true, "chennai", "tn", "hindustan");
		
		System.out.println(singer.heir);
		System.out.println(singer.balasubramanya);
		System.out.println(balasubramanya.getMovie());
		System.out.println(balasubramanya.getName());
		System.out.println(balasubramanya.getRole());
		
		singer.clap();


	}

}
