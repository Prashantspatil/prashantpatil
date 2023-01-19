package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.MissileDTO;

@Component
public class MissileRepositoryImpl implements MissileRepository {

	@Override
	public boolean save(MissileDTO missileDTO) {
		System.out.println("running save in repoimpl");
		System.out.println("missileDTO "+missileDTO);
		return false;
	}

}
