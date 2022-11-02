package com.xworkz.access.things;

public class ColdCake {
	
	public String name="honey";
	public Cake cake=new Cake(1.00, 45, "bengaluru", 2.00, true, "rajajinagar", "bendakaluru", "karnataka");
	
	public void cut() {
		System.out.println(this.name);
		if (this.cake!=null) {
			System.out.println(this.cake);
			System.out.println(cake.area);
			System.out.println(cake.best);
			System.out.println(cake.branch);
			System.out.println(cake.place);
			System.out.println(cake.price);
			System.out.println(cake.state);
			System.out.println(cake.temperature);
			System.out.println(cake.weight);
			
			System.out.println(cake.getFlavour());
			cake.setFlavour("venilla");
			System.out.println("modified flavour " + cake.getFlavour());
			
			System.out.println(cake.getFranchies());
			cake.setFranchies("ibaco");
			System.out.println("modified franchies " + cake.getFranchies());
			
			System.out.println(cake.getType());
			cake.setType("normal");
			System.out.println("modified type " + cake.getType());
		}
		else {
			System.out.println("cake is null");
		}
	}

}
