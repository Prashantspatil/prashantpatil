package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.ResortDTO;
import com.xworkz.lombok.repository.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepository resortRepository;

	public ResortServiceImpl(ResortRepository resortRepository) {
		this.resortRepository = resortRepository;
		System.out.println("created service by passing repo...");
	}

	@Override
	public boolean validateAndSave(ResortDTO resortDTO) {
		System.out.println("running validate&save");
		System.out.println("resortDTO " + resortDTO);
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(resortDTO);
		if (!violations.isEmpty()) {
			System.out.println("violations present");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return true;
		} else {
			System.out.println("data is valid & saved");
			boolean saved = this.resortRepository.save(resortDTO);
			System.out.println("saved" + saved);
			return saved;
		}
	}
}
