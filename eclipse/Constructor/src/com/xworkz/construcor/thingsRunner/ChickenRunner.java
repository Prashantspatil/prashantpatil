package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
public class ChickenRunner {

	public static void main(String[] args) {
		Chicken.brand="KFC";
		System.out.println("brand : "+Chicken.brand);
		Chicken chicken=new Chicken();
		System.out.println("type : "+chicken.type);
		System.out.println("price : "+chicken.price);
		System.out.println("weight : "+chicken.weight);
		
		System.out.println(System.lineSeparator());
		Chicken.brand="McD";
		System.out.println("brand : "+Chicken.brand);
		Chicken chicken1=new Chicken("Farm"); 
		System.out.println("type : "+chicken1.type);
		System.out.println("price : "+chicken1.price);
		System.out.println("weight : "+chicken1.weight);
		
		System.out.println(System.lineSeparator());
		Chicken.brand=null;
		System.out.println("brand : "+Chicken.brand);
		Chicken chicken2=new Chicken("Farm", 180);
		System.out.println("type : "+chicken2.type);
		System.out.println("price : "+chicken2.price);
		System.out.println("weight : "+chicken2.weight);
		
		System.out.println(System.lineSeparator());
		Chicken.brand="KFC";
		System.out.println("brand : "+Chicken.brand);
		Chicken chicken3=new Chicken("Farm", 180, 1.5);
		System.out.println("type : "+chicken3.type);
		System.out.println("price : "+chicken3.price);
		System.out.println("weight : "+chicken3.weight);

	}

}
