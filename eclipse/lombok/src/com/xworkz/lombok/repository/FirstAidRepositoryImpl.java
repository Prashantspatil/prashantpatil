package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.FirstAidDTO;

@Component
public class FirstAidRepositoryImpl implements FirstAidRepository {

	@Override
	public boolean save(FirstAidDTO firstAidDTO) {
		System.out.println("running save in repoimpl");
		System.out.println("firstAidDTO "+firstAidDTO);
		return false;
	}

}
