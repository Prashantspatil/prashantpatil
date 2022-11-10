package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Prashanth;
import com.xworkz.inheritance.things.Director;

public class DirectorRunner {

	public static void main(String[] args) {

		Director director=new Prashanth("sandalwood", 5, "ugram");
		director.screen();
		System.out.println(System.lineSeparator());
		Prashanth prashanth=new Prashanth("pan india", 1, "kgf");
		prashanth.screen();

	}

}
