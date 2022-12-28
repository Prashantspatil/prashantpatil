package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimCardRunner {

	public static void main(String[] args) {
		
		Collection<String> cards=new ArrayList<String>();
		cards.add("taat");
		cards.add("jio");
		cards.add("aircell");
		cards.add("docomo");
		cards.add("idea");
		cards.add("bsnl");
		cards.add("vodafone");
		cards.add("hutch");
		cards.add("spice");
		cards.add("relience");
		System.out.println("simcard collection size before : "+cards.size());
		cards.remove("idea");//remove method works like equals method(accessing & modifying)
		System.out.println("simcard collection after : "+cards.size());
		System.out.println(System.lineSeparator());
		
		boolean contain=cards.contains("idea");
		System.out.println("contain : "+contain);//returns false since idea is removed 
		boolean contain1=cards.contains("hutch");
		System.out.println("contains : "+contain1);//returns true
		System.out.println(System.lineSeparator());
		
		Iterator<String> palindrome=cards.iterator();
		while (palindrome.hasNext()) {
			String string = (String) palindrome.next();
			StringBuilder element=new StringBuilder(string);
			element.reverse();
			String str=element.toString();
			if(string.equals(str)) {
				System.out.println("palindrome : "+element);
			}
		}
		
		System.out.println("size : "+cards);
		Iterator<String> sims=cards.iterator();
		while (sims.hasNext()) {
			String string = (String) sims.next();
			if (string.startsWith("a")) {
				sims.remove();
			}
		}System.out.println("removed 'a' started : "+cards);
		System.out.println("removed 'a' started : "+cards.size());
	}

}
