package com.xworkz.access.boot;

import com.xworkz.access.things.Cinema;
import com.xworkz.access.things.Kannada;

public class KannadaRunner {

	public static void main(String[] args) {
		
		Kannada kannada=new Kannada();
		Cinema cinema=new Cinema(12.00, 100, "kannadanadu", 7.00, true, "dada", "vajramuni", "appu");
		
		System.out.println(kannada.lifeLine);
		System.out.println(kannada.cinema);
		System.out.println(cinema.getIndustry());
		System.out.println(cinema.getPlace());
		System.out.println(cinema.getStudio());
		
		kannada.silverScreen();

	}

}
