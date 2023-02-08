package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepo;
@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepo bakeryRepo;
	
	public BakeryServiceImpl() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) {
		System.out.println("running validateAndSave");
		boolean saved=this.bakeryRepo.save(bakeryDTO);
		System.out.println("saved :"+saved);
		return false;
	}

}
