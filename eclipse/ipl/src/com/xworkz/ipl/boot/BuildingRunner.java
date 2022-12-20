package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.BuildingDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.BuildingRepository;
import com.xworkz.ipl.repository.BuildingRepositoryImpl;
import com.xworkz.ipl.service.BuildingService;
import com.xworkz.ipl.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		
		BuildingDto buildingDto=new BuildingDto("system", LocalDateTime.now(), "psp", LocalDateTime.now(), 1, "xworkz", 1, true, true, "commercial");
		BuildingRepository repository=new BuildingRepositoryImpl();
		BuildingService service=new BuildingServiceImpl(repository);
		
		BuildingDto buildingDto1=new BuildingDto("system", LocalDateTime.now(), "patil", LocalDateTime.now(), 2, "odc", 2, true, false, "family");
		BuildingDto buildingDto2=new BuildingDto("system", LocalDateTime.now(), "pspatil", LocalDateTime.now(), 3, "omkar", 3, false, true, "business");
		BuildingDto buildingDto3=new BuildingDto("system", LocalDateTime.now(), "ppatil", LocalDateTime.now(), 4, "aksar", 1, false, false, "bda");
		BuildingDto buildingDto4=new BuildingDto("system", LocalDateTime.now(), "prashant", LocalDateTime.now(), 5, "vinay", 1, true, true, "market");
		
		try {
			boolean bunglow =service.validateAndSave(buildingDto);
			boolean bunglow1 =service.validateAndSave(buildingDto1);
			boolean bunglow2 =service.validateAndSave(buildingDto2);
			boolean bunglow3 =service.validateAndSave(buildingDto3);
			boolean bunglow4 =service.validateAndSave(buildingDto4);
		} catch (InvalidCredetialsException e) {
			e.printStackTrace();
		}

	}

}
