package com.xworkz.signup.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.signup.dto.SignUpDTO;

public interface SignUpService {

	Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO dto);

	default List<SignUpDTO> findAll() {
		return Collections.emptyList();
	}

	default Long findByUserName(String userName) {
		return null;
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}
	
	boolean sendMail(String email, String text);
	
	default SignUpDTO findByUserId(String userID, String password) {
		return null;
	}

	default SignUpDTO resetPassword(String emailID) {
		return null;
	}
	
	default SignUpDTO updatePassword(String userID, String password, String confirmPassword) {
		return null;
	}
	
}
