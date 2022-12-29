package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AirportDto;

public class AirportRunner {

	public static void main(String[] args) {

        AirportDto airportDto1=new AirportDto("kempegawda", 2001, "international");
        AirportDto airportDto2=new AirportDto("nadagawda", 2002, "domestic"); 
        AirportDto airportDto3=new AirportDto("mallangouda", 2005, "defence"); 
        AirportDto airportDto4=new AirportDto("shivangouda", 2004, "marine"); 
        AirportDto airportDto5=new AirportDto("mallangouda", 2003, "airforce"); 
        
        Collection<AirportDto> ref1=new ArrayList<AirportDto>();
        ref1.add(airportDto5);
        
        boolean equal1=ref1.contains(airportDto3);
        boolean equal2=ref1.contains(airportDto2);
        
        System.out.println("contain result : "+equal1);
        System.out.println(airportDto3);
        System.out.println("contain result : "+equal2);
        System.out.println(airportDto2);

	}

}
