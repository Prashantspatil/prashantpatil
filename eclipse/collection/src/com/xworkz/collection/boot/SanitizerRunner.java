package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizerDto;

public class SanitizerRunner {

	public static void main(String[] args) {
		
		SanitizerDto sanitizerDto1=new SanitizerDto("co12", "serum", "white", 5D);
		SanitizerDto sanitizerDto2=new SanitizerDto("co13", "bharathbiotech", "black", 15D);
		SanitizerDto sanitizerDto3=new SanitizerDto("co14", "punes pvt ltd", "pink", 25D);
		SanitizerDto sanitizerDto4=new SanitizerDto("co15", "bharath", "blue", 35D);
		SanitizerDto sanitizerDto5=new SanitizerDto("co16", "private", "violet", 45D);
		SanitizerDto sanitizerDto6=new SanitizerDto("co17", "govt", "purple", 55D);
		SanitizerDto sanitizerDto7=new SanitizerDto("co18", "sarkar", "white", 65D);
		SanitizerDto sanitizerDto8=new SanitizerDto("co19", "cowaxin", "red", 75D);
		SanitizerDto sanitizerDto9=new SanitizerDto("co20", "serum2", "green", 85D);
		SanitizerDto sanitizerDto10=new SanitizerDto("co22", "serum3", "yellow", 95D);
		
		Collection<SanitizerDto> collection=new ArrayList<SanitizerDto>();
		collection.add(sanitizerDto10);
		collection.add(sanitizerDto9);
		collection.add(sanitizerDto8);
		collection.add(sanitizerDto7);
		collection.add(sanitizerDto6);
		collection.add(sanitizerDto5);
		collection.add(sanitizerDto4);
		collection.add(sanitizerDto3);
		collection.add(sanitizerDto2);
		collection.add(sanitizerDto1);
		
		Iterator<SanitizerDto> ref1=collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDto element = ref1.next();
			if (element.getPrice() > 25) {
				System.out.println("sanitizers price at above 25 : "+element);
			}
		}
        Iterator<SanitizerDto> ref2=collection.iterator();
        while (ref2.hasNext()) {
			SanitizerDto element2 =  ref2.next();
			if (element2!=null) {
				System.out.println("no element is null : "+element2);
			}
		}
        Iterator<SanitizerDto> ref3=collection.iterator();
        while (ref3.hasNext()) {
			SanitizerDto element3 =  ref3.next();
			if (element3.getcolor().matches("green")) {
			    ref3.remove();
				System.out.println("sanitizer color is green : "+element3);
			}
			if (element3.getcolor().matches("red")) {
				ref3.remove();
				System.out.println("sanitizer color is red : "+element3);
			}
			if (element3.getcolor().matches("blue")) {
				ref3.remove();
				System.out.println("sanitizer color is blue : "+element3);
			}
		}
        Iterator<SanitizerDto> ref4=collection.iterator();
		while (ref4.hasNext()) {
			SanitizerDto element4 = (SanitizerDto) ref4.next();
			if (element4.getPrice()<15) {
				System.out.println("least price sanitizer : "+element4);
			}
		}
			Iterator<SanitizerDto> ref5=collection.iterator();	
			while (ref5.hasNext()) {
				SanitizerDto element5 =  ref5.next();
				if(element5.getPrice()>90) {
					System.out.println("maximum price sanitizer : "+element5);
				}
			}
			Iterator<SanitizerDto> ref6=collection.iterator();
		     while (ref6.hasNext()) {
				SanitizerDto element6 =  ref6.next();
				if (element6.getPrice()== 65) {
					System.out.println("second maximum price sanitizer : "+element6);
				}
			}
	}

}
