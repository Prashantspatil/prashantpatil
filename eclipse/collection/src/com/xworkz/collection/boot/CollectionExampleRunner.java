package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExampleRunner {

	public static void main(String[] args) {
		
		//animal collection
		String animal1="dog";
		String animal2="lion";
		String animal3="tiger";
		String animal4="leopard";
		String animal5="elephant";
		String animal6="horse";
		String animal7="cheetah";
		String animal8="cat";
		String animal9="cow";
		String animal10="buffalo";
		String animal11="";
		String animal12=null;
		
		Collection<String> pranigalu=new ArrayList<String>();
		pranigalu.add(animal10);
		pranigalu.add(animal9);
		pranigalu.add(animal8);
		pranigalu.add(animal7);
		pranigalu.add(animal6);
		pranigalu.add(animal5);
		pranigalu.add(animal4);
		pranigalu.add(animal3);
		pranigalu.add(animal2);
		pranigalu.add("buffalo");
		pranigalu.add(animal11);//added
		pranigalu.add(animal12);//added
		
		System.out.println("animals in collection : "+pranigalu.size());
		System.out.println("accessed through for-each");
	    for (String element : pranigalu) {
			System.out.println(element);
		}
        System.out.println("accessed through iterator");
	    Iterator<String> ref=pranigalu.iterator();//interface reference=Implementation
	    while (ref.hasNext()) {
			String element1 = (String) ref.next();
			System.out.println(element1);
		}
	    System.out.println(System.lineSeparator());
	    //watch collection
	    String watch1="hmt";
	    String watch2="sonata";
	    String watch3="maxima";
	    String watch4="horpa";
	    String watch5="chumbak";
	    Collection<String> gadiyara=new ArrayList<String>();
	    gadiyara.add(watch5);
	    gadiyara.add(watch4);
	    gadiyara.add(watch3);
	    gadiyara.add(watch2);
	    gadiyara.add(watch1);
	    //gadiyara.add(watch5);
	    System.out.println("watch in collection : "+gadiyara.size());
	    System.out.println("accessed through for-each");
	    for (String string : gadiyara) {
			System.out.println(string);
		}
	    Iterator<String> baandh=gadiyara.iterator();
	    System.out.println("accessed through iterator");
	    while (baandh.hasNext()) {
			String gadi = (String) baandh.next();
			System.out.println(gadi);
		}
	    System.out.println(System.lineSeparator());
	    
	    //ShoeSize collection
	    int size1=1;
	    int size2=2;
	    int size3=3;
	    int size4=4;
	    int size5=5;
	    int size6=6;
	    int size7=7;
	    int size8=8;
	    int size9=9;
	    int size10=10;
	    int size11=11;
	    int size12=12;
	    int size13=13;
	    int size14=14;
	    int size15=15;
	    Collection<Integer> collection=new ArrayList<Integer>();
	    collection.add(size1);
	    collection.add(size2);
	    collection.add(size3);
	    collection.add(size4);
	    collection.add(size5);
	    collection.add(size6);
	    //collection.add(size6); //accessed duplicate through for-each & iterator
	    collection.add(size7);
	    collection.add(size8);
	    collection.add(size9);
	    collection.add(size10);
	    collection.add(size11);
	    collection.add(size12);
	    collection.add(size13);
	    collection.add(size14);
	    collection.add(size15);
	   System.out.println("shoe size in collection :"+collection.size());
	   System.out.println("accessed through for-each");
	   for (Integer integer : collection) {
		     System.out.println("size : "+integer);
	}
	   Iterator<Integer> iterator=collection.iterator();
	   System.out.println("accessed through iterator");
	   while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		System.out.println("size : "+integer);
	}
	   System.out.println(System.lineSeparator());
	   //MetroCity collection
	   String city1="bengaluru";
	   String city2="new delhi";
	   String city3="hyderabad";
	   String city4="chennai";
	   String city5="noida";
	   Collection<String> cities=new ArrayList<String>();
	   cities.add(city5);
	   cities.add(city4);
	   cities.add(city3);
	   cities.add(city2);
	   cities.add(city1);
	   System.out.println("cities in collection : "+cities.size());
	   System.out.println("accessed through for-each");
	   for (String string : cities) {
		System.out.println(string);
	}
	   Iterator<String> pattana=cities.iterator();
	   System.out.println("accessed through iterator");
	   while (pattana.hasNext()) {
		String string1 = (String) pattana.next();
		System.out.println(string1);
	}
	   System.out.println(System.lineSeparator());
	   //software company collection
	   String company1="microsoft";
	   String company2="oracle";
	   String company3="ibm";
	   String company4="salesforce";
	   String company5="sap";
	   String company6="autodesk";
	   String company7="intuit";
	   String company8="splunk";
	   String company9="sage solutions";
	   String company10="pixels";
	   String company11="quantum";
	   String company12="dell";
	   String company13="twilio";
	   String company14="VMware";
	   String company15="adp";
	   String company16="nebula";
	   String company17="atlassian";
	   String company18="citrix";
	   String company19="bridger";
	   String company20="xero";
	   Collection<String> software=new ArrayList<String>();
	   software.add(company20);
	   software.add(company19);
	   software.add(company18);
	   software.add(company17);
	   software.add(company16);
	   software.add(company15);
	   software.add(company14);
	   software.add(company13);
	   software.add(company12);
	   software.add(company11);
	   software.add(company10);
	   software.add(company9);
	   software.add(company8);
	   software.add(company7);
	   software.add(company6);
	   software.add(company5);
	   software.add(company4);
	   software.add(company3);
	   software.add(company2);
	   software.add(company1);
	   System.out.println("companies in collection : "+software.size());
	   System.out.println("accessed through for-each");
	   for (String tcs : software) {
		System.out.println(tcs);
	}
	   Iterator<String> wipro=software.iterator();
	   System.out.println("accessed through iterator");
	   while (wipro.hasNext()) {
		String infosys = (String) wipro.next();
		System.out.println(infosys);
	}
	}

}
