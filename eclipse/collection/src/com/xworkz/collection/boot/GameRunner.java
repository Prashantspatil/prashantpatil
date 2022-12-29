package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.GameDto;

public class GameRunner {

	public static void main(String[] args) {
		
		GameDto gameDto1= new GameDto("pubg", "esport", 4);
		GameDto gameDto2= new GameDto("kabaddi", "indoor", 7);
		GameDto gameDto3= new GameDto("basketball", "indoor", 6);
		GameDto gameDto4= new GameDto("football", "outdoor", 11);
		GameDto gameDto5= new GameDto("cricket", "outdoor", 11);
		
		Collection<GameDto> collection=new ArrayList<GameDto>();
		collection.add(gameDto5);
		
		boolean equal1=collection.contains(gameDto4);
		System.out.println("contain result : "+equal1);
		System.out.println(gameDto4);

	}

}
