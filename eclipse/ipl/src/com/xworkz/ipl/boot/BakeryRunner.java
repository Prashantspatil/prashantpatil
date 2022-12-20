package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.BakeryDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.BakeryRepository;
import com.xworkz.ipl.repository.BakeryRepositoryImpl;
import com.xworkz.ipl.service.BakeryService;
import com.xworkz.ipl.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {
		
		BakeryDto bakeryDto=new BakeryDto("system", LocalDateTime.now(), "naanu", LocalDateTime.now(), "abhi", "abhishek", 7349021512L, "bidar", "puff");
		BakeryRepository bakeryRepository=new BakeryRepositoryImpl();
		BakeryService bakeryService=new BakeryServiceImpl(bakeryRepository);
		
		BakeryDto bakeryDto1=new BakeryDto("system", LocalDateTime.now(), "neenu", LocalDateTime.now(), "mallan", "mallangouda", 7349021513L, "yadgir", "everything");
		BakeryDto bakeryDto2=new BakeryDto("system", LocalDateTime.now(), "you", LocalDateTime.now(), "vin", "vinod", 7349021514L, "bengaluru", "cheeps");
		BakeryDto bakeryDto3=new BakeryDto("system", LocalDateTime.now(), "nenu", LocalDateTime.now(), "shru", "shruti", 7349021515L, "kalyan", "ice");
		BakeryDto bakeryDto4=new BakeryDto("system", LocalDateTime.now(), "manam", LocalDateTime.now(), "pooji", "pooja", 7349021511L, "raicjur", "cream");
		
		try {
			boolean cake=bakeryService.validateAndSave(bakeryDto);
			boolean cake1=bakeryService.validateAndSave(bakeryDto4);
			boolean cake2=bakeryService.validateAndSave(bakeryDto3);
			boolean cake3=bakeryService.validateAndSave(bakeryDto2);
			boolean cake4=bakeryService.validateAndSave(bakeryDto1);
		} catch (InvalidCredetialsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
