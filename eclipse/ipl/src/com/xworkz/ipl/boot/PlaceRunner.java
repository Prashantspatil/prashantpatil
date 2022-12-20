package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.PlaceDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.PlaceRepository;
import com.xworkz.ipl.repository.PlaceRepositoryImpl;
import com.xworkz.ipl.service.PlaceService;
import com.xworkz.ipl.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDto placeDto=new PlaceDto("sys", LocalDateTime.now(), "ppp", LocalDateTime.now(), "yadgir", "fort", 585202L, 3, "kar");
		PlaceRepository repository=new PlaceRepositoryImpl();
		PlaceService service=new PlaceServiceImpl(repository);
		
		PlaceDto placeDto1=new PlaceDto("sys1", LocalDateTime.now(), "pppp", LocalDateTime.now(), "glb", "fort1", 585201L, 2, "karr");
		PlaceDto placeDto2=new PlaceDto("sys2", LocalDateTime.now(), "ppppp", LocalDateTime.now(), "bid", "fort2", 585203L, 1, "karrr");
		PlaceDto placeDto3=new PlaceDto("sys3", LocalDateTime.now(), "pppppp", LocalDateTime.now(), "shp", "fort3", 585204L, 4, "karrrr");
		PlaceDto placeDto4=new PlaceDto("sys4", LocalDateTime.now(), "ppppppp", LocalDateTime.now(), "sur", "fort4", 585205L, 5, "karrrrr");
		
		try {
			boolean plot =service.validateAndSave(placeDto);
			boolean plot1 =service.validateAndSave(placeDto1);
			boolean plot2 =service.validateAndSave(placeDto2);
			boolean plot3 =service.validateAndSave(placeDto3);
			boolean plot4 =service.validateAndSave(placeDto4);
		} catch (InvalidCredetialsException e) {
			e.printStackTrace();
		}


	}

}
