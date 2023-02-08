package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepoImpl implements BakeryRepo {

	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("running save in bakery repo impl");
		return false;
	}

}
