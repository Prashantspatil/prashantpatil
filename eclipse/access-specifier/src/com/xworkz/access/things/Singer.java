package com.xworkz.access.things;

public class Singer {
	
	public String heir="karnataka";
	public Balasubramanya balasubramanya=new Balasubramanya(12.00, 75, "01/01", 40.00, true, "chennai", "tn", "hindustan");
	
	public void clap() {
		System.out.println(this.heir);
		if (this.balasubramanya!=null) {
			System.out.println(this.balasubramanya);
			System.out.println(balasubramanya.age);
			System.out.println(balasubramanya.best);
			System.out.println(balasubramanya.born);
			System.out.println(balasubramanya.country);
			System.out.println(balasubramanya.followers);
			System.out.println(balasubramanya.state);
			System.out.println(balasubramanya.place);
			System.out.println(balasubramanya.songs);
			
			System.out.println(balasubramanya.getMovie());
			balasubramanya.setMovie("deepavali");
			System.out.println("modified movie " + balasubramanya.getMovie());
			
			System.out.println(balasubramanya.getName());
			balasubramanya.setName("spb");
			System.out.println("modified name " + balasubramanya.getName());
			
			System.out.println(balasubramanya.getRole());
			balasubramanya.setRole("actor");
			System.out.println("modified role " + balasubramanya.getRole());
		}
		else {
			System.out.println("balasubramanya is null");
		}
	}

}
