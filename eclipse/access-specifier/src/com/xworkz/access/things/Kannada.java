package com.xworkz.access.things;

public class Kannada {
	
	public String lifeLine="kannada jeeva";
	public Cinema cinema=new Cinema(12.00, 100, "kannadanadu", 7.00, true, "dada", "vajramuni", "appu");
	
	public void silverScreen() {
		System.out.println(this.lifeLine);
		if (this.cinema!=null) {
			System.out.println(this.cinema);
			System.out.println(cinema.dance);
			System.out.println(cinema.hero);
			System.out.println(cinema.heroes);
			System.out.println(cinema.income);
			System.out.println(cinema.kannada);
			System.out.println(cinema.state);
			System.out.println(cinema.viewers);
			System.out.println(cinema.villain);
			
			System.out.println(cinema.getIndustry());
			cinema.setIndustry("gandhada gudi");
			System.out.println("modified industry " + cinema.getIndustry());
			
			System.out.println(cinema.getPlace());
			cinema.setPlace("bendakaluru");
			System.out.println("modified place " + cinema.getPlace());
			
			System.out.println(cinema.getStudio());
			cinema.setStudio("kannada studio");
			System.out.println("modified studio " + cinema.getStudio());
		}
		else {
			System.out.println("cinema is null");
		}
	}

}
