package com.xworkz.access.things;

public class Billionaire {
	
	public String continent="asia";
	public Adani adani=new Adani(13.00, 63, "02/02", 45.00, true, "gandhinagar", "gujarath", "hindustan");
	
	public void list() {
		System.out.println(this.continent);
		if (this.adani!=null) {
			System.out.println(this.adani);
			System.out.println(adani.age);
			System.out.println(adani.richest);
			System.out.println(adani.born);
			System.out.println(adani.country);
			System.out.println(adani.income);
			System.out.println(adani.state);
			System.out.println(adani.place);
			System.out.println(adani.tax);
			
			System.out.println(adani.getCompany());
			adani.setCompany("adani transports");
			System.out.println("modified company " + adani.getCompany());
			
			System.out.println(adani.getField());
			adani.setField("philanthropy");
			System.out.println("modified field " + adani.getField());
			
			System.out.println(adani.getName());
			adani.setName("gm");
			System.out.println("modified name " + adani.getName());
		}
		else {
			System.out.println("adani is null");
		}
	}

}
