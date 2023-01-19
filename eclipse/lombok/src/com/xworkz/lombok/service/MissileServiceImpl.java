package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.MissileDTO;
import com.xworkz.lombok.repository.MissileRepository;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;
	private MissileRepository missileRepository;

	@Autowired
	public MissileServiceImpl(MissileRepository missileRepository) {
		this.missileRepository = missileRepository;
		System.out.println("created service by passing repo...");
	}

	@Override
	public boolean validateAndSave(MissileDTO missileDTO) {
		System.out.println("running validate&save");
		System.out.println("missileDTO " + missileDTO);
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(missileDTO);
		if (!violations.isEmpty()) {
			System.out.println("violations present");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return true;
		} else {
			System.out.println("data is valid & saved");
			boolean saved = this.missileRepository.save(missileDTO);
			System.out.println("saved" + saved);
			return saved;
		}
	}
}
