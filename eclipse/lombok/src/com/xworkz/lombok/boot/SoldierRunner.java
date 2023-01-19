package com.xworkz.lombok.boot;

import com.xworkz.lombok.dto.SoldierDTO;
import com.xworkz.lombok.repository.SoldierRepository;
import com.xworkz.lombok.repository.SoldierRepositoryImpl;
import com.xworkz.lombok.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO soldierDTO=new SoldierDTO("bipin rawat", 75, "4-star", "chief of defence staff");
		SoldierServiceImpl serviceImpl=new SoldierServiceImpl();
		SoldierRepository repository=new SoldierRepositoryImpl();
		serviceImpl.setterSoldierRepository(repository);
		serviceImpl.validateAndSave(soldierDTO);
		repository.save(soldierDTO);
		System.out.println(soldierDTO);

	}

}
