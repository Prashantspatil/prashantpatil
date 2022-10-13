package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
public class BoatRunner {

	public static void main(String[] args) {
	
		Boat boat=new Boat('M');
		System.out.println("name : "+boat.name);
		System.out.println("color : "+boat.color);
		System.out.println("type : "+boat.type);
		System.out.println("company : "+boat.companyName);
		System.out.println("owner : "+boat.owner);
		
		Boat boat2=new Boat("Cordelia");
		System.out.println("name : "+boat2.name);
		System.out.println("color : "+boat2.color);
		System.out.println("type : "+boat2.type);
		System.out.println("company : "+boat2.companyName);
		System.out.println("owner : "+boat2.owner);
		
		Boat boat3=new Boat('M', "Adani");
		System.out.println("name : "+boat3.name);
		System.out.println("color : "+boat3.color);
		System.out.println("type : "+boat3.type);
		System.out.println("company : "+boat3.companyName);
		System.out.println("owner : "+boat3.owner);
		
		Boat boat4=new Boat("Cordelia",'M');
		System.out.println("name : "+boat4.name);
		System.out.println("color : "+boat4.color);
		System.out.println("type : "+boat4.type);
		System.out.println("company : "+boat4.companyName);
		System.out.println("owner : "+boat4.owner);
		
		Boat boat5=new Boat("Cordelia","White");
		System.out.println("name : "+boat5.name);
		System.out.println("color : "+boat5.color);
		System.out.println("type : "+boat5.type);
		System.out.println("company : "+boat5.companyName);
		System.out.println("owner : "+boat5.owner);
		
		Boat boat6=new Boat("Cordelia","White","AdaniPorts");
		System.out.println("name : "+boat6.name);
		System.out.println("color : "+boat6.color);
		System.out.println("type : "+boat6.type);
		System.out.println("company : "+boat6.companyName);
		System.out.println("owner : "+boat6.owner);
		
		Boat boat7=new Boat("Cordelia","White","AdaniPorts",'M');
		System.out.println("name : "+boat7.name);
		System.out.println("color : "+boat7.color);
		System.out.println("type : "+boat7.type);
		System.out.println("company : "+boat7.companyName);
		System.out.println("owner : "+boat7.owner);
		
		Boat boat8=new Boat("White",'M',"Cordelia","AdaniPorts","Adani");
		System.out.println("name : "+boat8.name);
		System.out.println("color : "+boat8.color);
		System.out.println("type : "+boat8.type);
		System.out.println("company : "+boat8.companyName);
		System.out.println("owner : "+boat8.owner);
	}

}
