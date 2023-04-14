package com.xworkz.signup.dto;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class SignUpDTO {

	@NotNull
	private int id;

	@NotBlank
	@Size(min = 3, max = 20, message = "userID can't be less than3 & more than 20")
	private String userID;

	@NotBlank
	@Size(min = 3, max = 45, message = "emailID can't be less than 3 & more than 45")
	private String emailID;

	@NotBlank
	@Size(min = 3, max = 20, message = "password can't be less than 3 & more than 20")
	private String password;

	@NotBlank
	@NotBlank
	private String confirmPassword;

	@NotNull
	private Long mobile;

	@NotNull
	private Boolean agreement;

	private int loginAttempts;
	
	private Boolean rePassword;
	
	private LocalTime expTime;
	
}
