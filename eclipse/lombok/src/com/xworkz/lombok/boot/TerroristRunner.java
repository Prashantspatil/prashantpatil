package com.xworkz.lombok.boot;

import com.xworkz.lombok.dto.TerroristDTO;
import com.xworkz.lombok.repository.TerroristRepository;
import com.xworkz.lombok.repository.TerroristRepositoryImpl;
import com.xworkz.lombok.service.TerroristService;
import com.xworkz.lombok.service.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {
		
		TerroristDTO dto=new TerroristDTO("kassab", 21, "pakistan", false, false, "lashkaretaiba");
		
		TerroristServiceImpl service=new TerroristServiceImpl();
		
		TerroristRepository repository=new TerroristRepositoryImpl();
		
		service.setterTerroristrepository(repository);
		service.validateAndSave(dto);
		repository.save(dto);
		System.out.println(dto);

	}

}
