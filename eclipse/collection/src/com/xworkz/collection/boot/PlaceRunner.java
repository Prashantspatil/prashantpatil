package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.PlaceDto;

public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDto dto1=new PlaceDto("bengaluru", "silicon valley", 450D);
		PlaceDto dto2=new PlaceDto("mysore", "silicon valley", 250D);
		PlaceDto dto3=new PlaceDto("mandya", "krs dam", 200D);
		PlaceDto dto4=new PlaceDto("tumkur", "sidganga matha", 50D);
		PlaceDto dto5=new PlaceDto("shahapur", "everything", 650D);
		
		Collection<PlaceDto> ref1=new ArrayList<PlaceDto>();
		ref1.add(dto1);
		
		boolean equal1=ref1.contains(dto2);
		System.out.println("contain result : "+equal1);
		System.out.println(dto2);

	}

}
