package com.xworkz.signup.repository;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import com.xworkz.signup.entity.SignUpEntity;

public interface SignUpRepository {

	boolean save(SignUpEntity entity);

	default List<SignUpEntity> findAll() {
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
	
	default SignUpEntity findByUserId(String userID) {
		return null;
	}
		
	boolean loginCount(String userID, int loginAttempts);
	
	default SignUpEntity resetPassword(String emailID) {
		return null;
	}
	
	boolean update(SignUpEntity entity);
	
	boolean updatePassword(String userID, String password, boolean rePassword, LocalTime expTime);

}
