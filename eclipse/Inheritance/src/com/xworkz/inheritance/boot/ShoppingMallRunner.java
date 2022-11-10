package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.OrionMall;
import com.xworkz.inheritance.things.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		
		ShoppingMall mall=new OrionMall("prestige towers", 02, 2012);
		mall.mallOpen();
		System.out.println(System.lineSeparator());
		OrionMall mall2=new OrionMall("raajkumar road", 01, 2011);
		mall2.mallOpen();

	}

}
