package com.xworkz.signup.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/")
@EnableWebMvc
@Slf4j
@RestController
public class SignUpResource {
	
	@Autowired
	private SignUpService service;
	
	public SignUpResource() {
		log.info("created no-arg in " + getClass().getSimpleName());
	}
	
	@GetMapping(value = "/emailID/{emailID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onEmail(@PathVariable String emailID) {
		Long storedMail = this.service.findByEmail(emailID);
		log.error("",storedMail);
			if(storedMail == 0 ) {
				return "";
			}else {
			
		return "emailID exists";
	}
			
	}

	
	@GetMapping(value = "/mobile/{mobile}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onMobile(@PathVariable Long mobile) {
		Long storedMail = this.service.findByMobile(mobile);
		log.error(""+storedMail);
			if(storedMail == 0) {
				return "";
			}else {
		return "mobile exists";
	}
	}
	
	@PostMapping(value = "/userName/{userID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String userExist(@PathVariable String userID) {
		log.info("running userExist "+userID);
		Long storedUser = this.service.findByUserName(userID);
		log.error(""+storedUser);
		if(storedUser==0) {
			log.error("userID not found in db...");
			return "";
		}else {
			log.info("userID found in db");
			return "userID exists";
		}
		
	}

}
