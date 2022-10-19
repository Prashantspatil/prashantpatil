package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
public class RiverRunner {

	public static void main(String[] args) {
		
		String[] names= {"ganga","tunga","sanga","manga","pinga"};
		String[] countries= {"india","pak","afg","lanka","bangla"};
	    String[] states= {"ka","tn","up","mp","ap"};
	    String[] animals= {"elephant","tiger","lion","liger","tion"};
	    String[] plants= {"neem","tulsi","banyan","mango","apple"};
	    String[] stones= {"red","white","black","violet","dark"};
	    byte tributaries=6;//for byte explicit value
	    short places=45;//for short explicit value
	    
	    River river=new River("ganga", 1.5F, "gangothri", tributaries, places, names, countries, states, animals, plants, stones);
	    river.displayDetails();

	}

}
