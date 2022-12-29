package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalenderDto;

public class CalenderRunner {

	public static void main(String[] args) {
		
		CalenderDto calenderDto1=new CalenderDto("gregorian", 25, "white");
		CalenderDto calenderDto2=new CalenderDto("hebrew", 25, "blue");
		CalenderDto calenderDto3=new CalenderDto("mayan", 35, "red");
		CalenderDto calenderDto4=new CalenderDto("tamil", 45, "black");
		CalenderDto calenderDto5=new CalenderDto("egyptian", 55, "violet");
		
		Collection<CalenderDto> collection=new ArrayList<CalenderDto>();
		collection.add(calenderDto2);
		
		boolean equal=collection.contains(calenderDto1);
		System.out.println("contain result : "+equal);
		System.out.println(calenderDto1);

	}

}
