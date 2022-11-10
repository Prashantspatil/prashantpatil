package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Kasab;
import com.xworkz.inheritance.things.Terrorist;

public class TerroristRunner {

	public static void main(String[] args) {
		
		Terrorist terrorist=new Terrorist();
		terrorist.attack();
		terrorist.bomb();
		System.out.println(System.lineSeparator());
		Kasab kasab=new Kasab("pak", "delhi", 7, "terrorism");
		kasab.attack();
		kasab.bomb();

	}

}
