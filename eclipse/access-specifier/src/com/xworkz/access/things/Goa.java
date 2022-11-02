package com.xworkz.access.things;

public class Goa {
	
	public String continent="asia";
	public Beach beach=new Beach(10.00, 7, "pollavarim", 5.00, true, "panaji", "goa", "india");
	
	public void view() {
		System.out.println(this.continent);
		if (this.beach!=null) {
			System.out.println(this.beach);
			System.out.println(beach.eco);
			System.out.println(beach.area);
			System.out.println(beach.location);
			System.out.println(beach.country);
			System.out.println(beach.income);
			System.out.println(beach.state);
			System.out.println(beach.place);
			System.out.println(beach.no);
			
			System.out.println(beach.getName());
			beach.setName("pondi");
			System.out.println("modified name " + beach.getName());
			
			System.out.println(beach.getType());
			beach.setType("fresh");
			System.out.println("modified type " + beach.getType());
			
			System.out.println(beach.getTerritory());
			beach.setTerritory("pudu");
			System.out.println("modified territory " + beach.getTerritory());
		}
		else {
			System.out.println("beach is null");
		}
	}

}
