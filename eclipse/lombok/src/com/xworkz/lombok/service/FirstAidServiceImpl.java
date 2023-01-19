package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.lombok.dto.FirstAidDTO;
import com.xworkz.lombok.repository.FirstAidRepository;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	
	@Autowired
	private Validator validator;
	private FirstAidRepository firstAidRepository;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepository firstAidRepository) {
		this.firstAidRepository=firstAidRepository;
		System.out.println("created service by passing repo...");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO firstAidDTO) {
		System.out.println("running validate&save");
		System.out.println("firstAidDTO "+firstAidDTO);
		Set<ConstraintViolation<FirstAidDTO>> violations=this.validator.validate(firstAidDTO);
		if(!violations.isEmpty()) {
			System.err.println("violations present");
			violations.forEach(cv->System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("data is valid & can be saved");
			boolean saved=this.firstAidRepository.save(firstAidDTO);
			System.out.println("saved"+saved);
			return saved;
		}
		
	}

}
