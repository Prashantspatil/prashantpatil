package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.RailwayStationDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.RailwayStationRepository;
import com.xworkz.ipl.repository.RailwayStationRepositoryaImpl;
import com.xworkz.ipl.service.RailwayStationService;
import com.xworkz.ipl.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {
		
		RailwayStationDto railwayStationDto=new RailwayStationDto("system", LocalDateTime.now(), "psp", LocalDateTime.now(), "ksr", 10, "blr", 12);
		RailwayStationRepository railwayStationRepository=new RailwayStationRepositoryaImpl();
		RailwayStationService railwayStationService=new RailwayStationServiceImpl(railwayStationRepository);
		
		RailwayStationDto railwayStationDto1=new RailwayStationDto("system", LocalDateTime.now(), "pspatil", LocalDateTime.now(), "ypr", 15, "bengaluru", 8);
		RailwayStationDto railwayStationDto2=new RailwayStationDto("system", LocalDateTime.now(), "ppatil", LocalDateTime.now(), "ylk", 20, "yelhank", 4);
		RailwayStationDto railwayStationDto3=new RailwayStationDto("system", LocalDateTime.now(), "prashant", LocalDateTime.now(), "glb", 6, "kalburgi", 5);
		RailwayStationDto railwayStationDto4=new RailwayStationDto("system", LocalDateTime.now(), "patil", LocalDateTime.now(), "ygr", 30, "yadgir", 2);
		
		try {
			boolean railwayStation=railwayStationService.validateAndSave(railwayStationDto);
			boolean railwayStation1=railwayStationService.validateAndSave(railwayStationDto1);
			boolean railwayStation2=railwayStationService.validateAndSave(railwayStationDto2);
			boolean railwayStation3=railwayStationService.validateAndSave(railwayStationDto3);
			boolean railwayStation4=railwayStationService.validateAndSave(railwayStationDto4);
		} catch (InvalidCredetialsException e) {
			e.printStackTrace();
		}
		
	}

}
