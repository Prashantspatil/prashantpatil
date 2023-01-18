package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.lombok.dto.TerroristDTO;
import com.xworkz.lombok.repository.TerroristRepository;

public class TerroristServiceImpl implements TerroristService {

	private TerroristRepository terroristRepository;

	public TerroristServiceImpl() {
		System.out.println("created TerroristServiceImpl no-arg const...");
	}
	
	public void setterTerroristrepository(TerroristRepository terroristRepository) {
		this.terroristRepository=terroristRepository;
	}

	@Override
	public boolean validateAndSave(TerroristDTO terroristDTO) {
		System.out.println("validation start-------");
		System.out.println("DTO passed : " + terroristDTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(terroristDTO);
		if (!violations.isEmpty()) {
			System.out.println("error occurred");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		} else {
			System.out.println("data is valid");
			boolean saved=terroristRepository.save(terroristDTO);
			System.out.println("dto saved "+saved);
			return saved;
		}

	}
}
