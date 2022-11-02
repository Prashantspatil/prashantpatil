package com.xworkz.access.boot;

import com.xworkz.access.things.Adani;
import com.xworkz.access.things.Billionaire;

public class BillionaireRunner {

	public static void main(String[] args) {
		
		Billionaire billionaire=new Billionaire();
		Adani adani=new Adani(13.00, 63, "02/02", 45.00, true, "gandhinagar", "gujarath", "hindustan");
		
		System.out.println(billionaire.continent);
		System.out.println(billionaire.adani);
		System.out.println(adani.getCompany());
		System.out.println(adani.getField());
		System.out.println(adani.getName());
		
		billionaire.list();

	}

}
