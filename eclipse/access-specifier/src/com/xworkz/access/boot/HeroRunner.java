package com.xworkz.access.boot;

import com.xworkz.access.things.Hero;
import com.xworkz.access.things.Vishnu;

public class HeroRunner {

	public static void main(String[] args) {
		
		Hero hero=new Hero();
		Vishnu vishnu=new Vishnu(7.50, 57, "sadashiva", 7.50, true, "mysore", "kar", "ind");
		
		System.out.println(hero.continent);
		System.out.println(hero.vishnu);
		System.out.println(vishnu.getRole());
		System.out.println(vishnu.getRole());
		System.out.println(vishnu.getName());
		
		hero.nagaraHavu();

	}

}
