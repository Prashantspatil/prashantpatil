package com.xworkz.signup.controller;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SignUpController {

	@Autowired
	private SignUpService service;

	public SignUpController() {
		log.info("created no-arg in " + getClass().getSimpleName());
	}

	@PostMapping("/sign")
	public String onSignUp(SignUpDTO dto, Model model) {
		log.info("running onSignUp");
		Set<ConstraintViolation<SignUpDTO>> violations = this.service.validateAndSave(dto);
		
			if (violations!=null && violations.isEmpty() && dto!=null) {
				model.addAttribute("message", "Registration successfull");
				log.info(""+dto);
				return "Save";
			} 
			model.addAttribute("errors",violations);
			model.addAttribute("message","registration failed");
			model.addAttribute("dto",dto);
		    return "Save";
	}

	@PostMapping("/signIn")
	public String signIn(String userID, String password, Model model, HttpServletRequest request) {
		log.info("running signIn");
		try {
			SignUpDTO dto = this.service.findByUserId(userID, password);
			log.info("dto : "+dto);
			
			if (dto.getLoginAttempts() >= 3) {
				model.addAttribute("msg","acc has been locked reset your password");
				log.info("acc locked after 3 time wrong credentials");
				return "SignIn";
			}
			
			if(dto!=null) {
				
				if(dto.getRePassword()==true) {
					if(!dto.getExpTime().isAfter(LocalTime.now())) {
						model.addAttribute("timeout","password expired try again new");
						return "SignIn";
					}
					model.addAttribute("userID",dto.getUserID());
					log.info("running in reset condition");
					log.info("reset password : "+dto.getRePassword());
					log.info("timer : "+dto.getExpTime().isBefore(LocalTime.now()));
					return "UpdatePassword";
				}
				
				log.info("userID & password matching");
			//	model.addAttribute("userID",dto.getUserID());
				HttpSession session = request.getSession(true);
				session.setAttribute(userID, dto.getUserID());
				return "LoginSuccess";
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			log.info(e.getMessage());
		}
		
		model.addAttribute("match","userID or password incorrect");
		return "SignIn";
		
	}
			
	@PostMapping("/reset")
	public String rePassword(String emailID, Model model) {
		try {
		SignUpDTO dto = this.service.resetPassword(emailID);
		if(dto.getRePassword()==true) {
			model.addAttribute("reset","password reset successfull try login");
			return "ResetPassword";
		}
		}catch (Exception e) {
			// TODO: handle exception
			log.info(e.getMessage());
		}
		return "ResetPassword";
	}
	
	@PostMapping("/updatePassword")
	public String updatePassword(String userID, String password, String confirmPassword) {
		this.service.updatePassword(userID, password, confirmPassword);
		return "UpdateSuccess";
	}

}
