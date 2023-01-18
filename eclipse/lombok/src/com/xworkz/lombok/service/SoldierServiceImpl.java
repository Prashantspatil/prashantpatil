package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.lombok.dto.SoldierDTO;
import com.xworkz.lombok.repository.SoldierRepository;

public class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepository soldierRepository;
	
	public void setterSoldierRepository(SoldierRepository soldierRepository) {
		this.soldierRepository=soldierRepository;
	}

	@Override
	public boolean validateAndSave(SoldierDTO soldierDTO) {
		System.out.println("validation starts");
		System.out.println("dto passed"+soldierDTO);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(soldierDTO);
		if(!violations.isEmpty()) {
			System.out.println("error occurred");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}
		else {
			System.out.println("data is valid");
			boolean saved=soldierRepository.save(soldierDTO);
			System.out.println("dto saved "+saved);
			return saved;
		}
	}

}
