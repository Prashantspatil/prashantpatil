package com.xworkz.access.things;

public class Hero {
	
	public String continent="asia";
	public Vishnu vishnu=new Vishnu(7.50, 57, "sadashiva", 7.50, true, "mysore", "kar", "ind");
	
	public void nagaraHavu() {
		System.out.println(this.continent);
		if (this.vishnu!=null) {
			System.out.println(this.vishnu);
			System.out.println(vishnu.age);
			System.out.println(vishnu.area);
			System.out.println(vishnu.fans);
			System.out.println(vishnu.country);
			System.out.println(vishnu.income);
			System.out.println(vishnu.state);
			System.out.println(vishnu.place);
			System.out.println(vishnu.handsome);
			
			System.out.println(vishnu.getName());
			vishnu.setName("sampath kumar");
			System.out.println("modified name " + vishnu.getName());
			
			System.out.println(vishnu.getRole());
			vishnu.setRole("protogonist");
			System.out.println("modified role " + vishnu.getRole());
			
			System.out.println(vishnu.getTitle());
			vishnu.setTitle("dada");
			System.out.println("modified title " + vishnu.getTitle());
		}
		else {
			System.out.println("vishnu is null");
		}
	}

}
