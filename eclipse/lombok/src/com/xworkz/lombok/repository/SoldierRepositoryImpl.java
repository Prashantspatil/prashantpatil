package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.SoldierDTO;

public class SoldierRepositoryImpl implements SoldierRepository {

	@Override
	public boolean save(SoldierDTO soldierDTO) {
		System.out.println("created save");
		return false;
	}

}
