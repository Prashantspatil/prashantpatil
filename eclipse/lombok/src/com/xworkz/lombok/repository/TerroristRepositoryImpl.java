package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.TerroristDTO;

public class TerroristRepositoryImpl implements TerroristRepository {
	
	public TerroristRepositoryImpl() {
		System.out.println("created TerroristRepositoryImpl no arg const...");
	}

	@Override
	public boolean save(TerroristDTO terroristDTO) {
		System.out.println("created save");
		return false;
	}

}
