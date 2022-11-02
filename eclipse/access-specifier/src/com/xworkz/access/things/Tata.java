package com.xworkz.access.things;

public class Tata {
	
	public String continent="asia";
	public EleVehicle eleVehicle=new EleVehicle(1.00, 05, "ratan", 2.00, true, "delhi", "haryana", "india");
	
	public void release() {
		System.out.println(this.continent);
		if (this.eleVehicle!=null) {
			System.out.println(this.eleVehicle);
			System.out.println(eleVehicle.eco);
			System.out.println(eleVehicle.owner);
			System.out.println(eleVehicle.units);
			System.out.println(eleVehicle.country);
			System.out.println(eleVehicle.income);
			System.out.println(eleVehicle.state);
			System.out.println(eleVehicle.place);
			System.out.println(eleVehicle.tax);
			
			System.out.println(eleVehicle.getCompany());
			eleVehicle.setCompany("eleVehicle transports");
			System.out.println("modified company " + eleVehicle.getCompany());
			
			System.out.println(eleVehicle.getType());
			eleVehicle.setType("suv");
			System.out.println("modified type " + eleVehicle.getType());
			
			System.out.println(eleVehicle.getName());
			eleVehicle.setName("tata");
			System.out.println("modified name " + eleVehicle.getName());
		}
		else {
			System.out.println("eleVehicle is null");
		}
	}

}
