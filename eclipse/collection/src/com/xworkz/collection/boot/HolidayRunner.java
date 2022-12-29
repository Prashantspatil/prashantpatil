package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.HolidayDto;

public class HolidayRunner {

	public static void main(String[] args) {
		
		HolidayDto holidayDto1=new HolidayDto("gandhi jayanthi", "govn", "freedom fighter");
		HolidayDto holidayDto2=new HolidayDto("nehru jayanthi", "no holiday", "pm");
		HolidayDto holidayDto3=new HolidayDto("inidra jayanthi", "non govn", "femake pm");
		HolidayDto holidayDto4=new HolidayDto("independence day", "govn", "freedom");
		HolidayDto holidayDto5=new HolidayDto("radhakrishnan jayanthi", "private", "president");
		
		Collection<HolidayDto> collection=new ArrayList<HolidayDto>();
		collection.add(holidayDto4);
		
		boolean equal=collection.contains(holidayDto1);
		System.out.println("contain result : "+equal);
		System.out.println(holidayDto1);

	}

}
