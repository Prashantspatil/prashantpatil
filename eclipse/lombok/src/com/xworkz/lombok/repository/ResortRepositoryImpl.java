package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository {

	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("running save in repoimpl");
		System.out.println("resortDTO "+resortDTO);
		return false;
	}

}
