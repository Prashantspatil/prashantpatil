package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.Type;
import com.xworkz.ipl.dto.HelmetDto;
import com.xworkz.ipl.repository.HelmetRepository;
import com.xworkz.ipl.repository.HelmetRepositoryImpl;
import com.xworkz.ipl.service.HelmetService;
import com.xworkz.ipl.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		
		HelmetDto dto=new HelmetDto("stud", 1000D, Color.BLACK, Type.FULL, "system", LocalDateTime.now(), "vinay", LocalDateTime.now());
		HelmetRepository helmetRepository=new HelmetRepositoryImpl();
		HelmetService helmetService=new HelmetServiceImpl(helmetRepository);
		
		boolean helmet=helmetService.validAndSave(dto);
		System.out.println("valid : "+helmet);	

	}

}
