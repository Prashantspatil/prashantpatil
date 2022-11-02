package com.xworkz.access.things;

public class Puma {
	
	public String continent="asia";
	public Shoe shoe=new Shoe(1.11, 1299, "airmax", 12.00, true, "bengaluru", "kar", "ind");
	
	public void outLet() {
		System.out.println(this.continent);
		if (this.shoe!=null) {
			System.out.println(this.shoe);
			System.out.println(shoe.air);
			System.out.println(shoe.sports);
			System.out.println(shoe.tax);
			System.out.println(shoe.country);
			System.out.println(shoe.income);
			System.out.println(shoe.state);
			System.out.println(shoe.place);
			System.out.println(shoe.price);
			
			System.out.println(shoe.getName());
			shoe.setName("nike");
			System.out.println("modified name " + shoe.getName());
			
			System.out.println(shoe.getType());
			shoe.setType("formal");
			System.out.println("modified type " + shoe.getType());
			
			System.out.println(shoe.getColor());
			shoe.setColor("red");
			System.out.println("modified color " + shoe.getColor());
		}
		else {
			System.out.println("shoe is null");
		}
	}

}
