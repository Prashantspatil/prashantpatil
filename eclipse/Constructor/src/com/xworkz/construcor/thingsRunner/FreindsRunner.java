package com.xworkz.construcor.thingsRunner;
import com.xworkz.construcor.things.*;
import com.xworkz.construcor.constants.*;
public class FreindsRunner {

	public static void main(String[] args) {
		
	    String[] names= {"mallu","vinnu","kp","manik"};
	    String[] degrees= {"mbbs","mech","e&e","bca"};
	    long[] nos= {123456L,234567L,345678L,456789L};
	    String[] places= {"yadgir","blr","bidar","awradh"};
	    String[] surnames= {"devangoan","nadagouda","patil","gangawar"};
	    String[] petNames= {"gaslet","diesel","damage","devru"};
	    
	    Freinds friends=new Freinds("avengers", 4, 12, Bond.BRO_HOOD, 15, names, degrees, nos, places, surnames, petNames);
	    
	    friends.showDetails();
	    
	}

}
