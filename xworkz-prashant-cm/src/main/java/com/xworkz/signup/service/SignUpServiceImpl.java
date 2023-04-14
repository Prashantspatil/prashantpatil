package com.xworkz.signup.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.entity.SignUpEntity;
import com.xworkz.signup.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private SignUpRepository signUpRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	String rePassword = DefaultPasswordGenerator.generate(6);

	private Set<ConstraintViolation<SignUpDTO>> validate(SignUpDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SignUpDTO>> violations = validator.validate(dto);
		return violations;
	}

	public SignUpServiceImpl() {
		log.info("created no-arg in " + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO dto) {
		log.info("running validateAndSave");
		Long userSize = this.findByUserName(dto.getUserID());
		Long emailSize = this.findByEmail(dto.getEmailID());
		Long mobileSize = this.findByMobile(dto.getMobile());
		log.error("userSize = " + userSize);
		log.error("emailSize = " + emailSize);
		log.error("mobileSize = " + mobileSize);
		
		Set<ConstraintViolation<SignUpDTO>> violations = validate(dto);
		if (violations != null && !violations.isEmpty()) {
					log.info("there is violations in dto");
					return violations;
				} 
		if(!dto.getPassword().equals(dto.getConfirmPassword())) {
			return null;
		}
		
		if(userSize==0 && emailSize==0 && mobileSize==0) {
					log.info("no violations proceed to save");
				
					SignUpEntity entity = new SignUpEntity();
					entity.setCreatedBy(dto.getUserID());
					entity.setCreatedOn(LocalDateTime.now());
					entity.setAgreement(dto.getAgreement());
					entity.setEmailID(dto.getEmailID());
					entity.setMobile(dto.getMobile());
					entity.setPassword(passwordEncoder.encode(dto.getPassword()));
					entity.setUserID(dto.getUserID());
					entity.setRePassword(false);
					entity.setExpTime(LocalTime.of(0, 0, 0));
					
					boolean saved = this.signUpRepository.save(entity);
					log.info("saved in entity" + saved);
					
					if(saved) {
						boolean sent = this.sendMail(dto.getEmailID(), "Thankyou for registration");
						log.info("email sent : "+sent);
				}
					
			} 
		return Collections.emptySet();

	}

	@Override
	public List<SignUpDTO> findAll() {
		List<SignUpEntity> entities = this.signUpRepository.findAll();
		List<SignUpDTO> dtos = new ArrayList<SignUpDTO>();
		for (SignUpEntity entity : entities) {
			SignUpDTO dto = new SignUpDTO();
			BeanUtils.copyProperties(entity, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public Long findByUserName(String userName) {
		Long userSize = this.signUpRepository.findByUserName(userName);
		return userSize;
	}

	@Override
	public Long findByEmail(String email) {
		Long emailSize = this.signUpRepository.findByEmail(email);
		return emailSize;
	}

	@Override
	public Long findByMobile(Long mobile) {
		Long mobileSize = this.signUpRepository.findByMobile(mobile);
		return mobileSize;
	}

	@Override
	public boolean sendMail(String email, String text) {
		String portNumber = "587";
		String hostName = "smtp.office365.com";
		String fromMail = "prashantspatil155@outlook.com";
		String password = "Pspatil155@";
		String email1 = email;
		String to = email;

		Properties properties = new Properties();
		properties.put("mail.smtp.port", portNumber);
		properties.put("mail.smtp.host", hostName);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.debug", true);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.transport.protocal", "smtp");

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromMail, password);
			}
		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromMail));
			message.setSubject("registration completed");
			message.setText(text);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email1));
			Transport.send(message);
			log.info("mail sent successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public SignUpDTO findByUserId(String userID, String password) {
		log.info("userID--"+userID);

		SignUpEntity entity = this.signUpRepository.findByUserId(userID);
		SignUpDTO dto = new SignUpDTO();
		BeanUtils.copyProperties(entity, dto);
		log.info("DTO: "+dto);
		log.info("encrypted password & given password matching"
				+ passwordEncoder.matches(password, entity.getPassword()));
		log.info("time matching : "+entity.getExpTime().isBefore(LocalTime.now()));
		log.info("prsent time : "+LocalTime.now());
		log.info("password expiry time : "+entity.getExpTime());
		log.info("time : "+LocalTime.now().isBefore(entity.getExpTime()));
		
		  if (entity.getLoginAttempts() >= 3) { 
			  log.info("running LoginAttempt");
			  return dto; 
		  }
		 
		if (dto.getUserID().equals(userID) && passwordEncoder.matches(password, entity.getPassword())) {
			return dto;
		} else {
			this.signUpRepository.loginCount(userID, entity.getLoginAttempts() + 1);
			log.info("login attempts" + entity.getLoginAttempts() + 1);
			return null;
		}

	}
	
	@Override
	public SignUpDTO resetPassword(String emailID) {
		log.info("running resetPassword :" );
		String resetPassword = DefaultPasswordGenerator.generate(6);
		SignUpEntity entity = this.signUpRepository.resetPassword(emailID);
		if(entity != null) {
			log.info("entity found for emailID : ",emailID);
			entity.setPassword(passwordEncoder.encode(resetPassword));
			entity.setUpdatedBy("System");
			entity.setUpdatedOn(LocalDateTime.now());
			entity.setLoginAttempts(0);
			entity.setRePassword(true);
			entity.setExpTime(LocalTime.now().plusMinutes(2));
			
			boolean update = this.signUpRepository.update(entity);
			if(update) {
				sendMail(entity.getEmailID(), "Your new password is : "+resetPassword + " log in within 2 mins before expiring");
			}
			log.info("updated : "+update);
			SignUpDTO dto = new SignUpDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		log.info("entity not found for email"+emailID);
		return SignUpService.super.resetPassword(emailID);
	}
	
	@Override
	public SignUpDTO updatePassword(String userID, String password, String confirmPassword) {
	//	SignUpEntity entity = new SignUpEntity();
		if(password.equals(confirmPassword)) {
			boolean updatedPassword = this.signUpRepository.updatePassword(userID, passwordEncoder.encode(password), false, LocalTime.of(0, 0, 0));
			log.info("updatedPassword : "+updatedPassword);
		}
		return SignUpService.super.updatePassword(userID, password, confirmPassword);
	}
	
	public final static class DefaultPasswordGenerator{
		private static final String[] charCategories = new String[] {"qwertyuioplkjhgfdsazxcvbnm","QWERTYUIOPLKJHGFDSAZXCVBNM","1234567890","@#$%&"};
		
		public static String generate(int passwordLength) {
			StringBuilder builder = new StringBuilder(passwordLength);
			Random random = new Random(System.nanoTime());
			
			for(int i=0; i<passwordLength; i++) {
				String charType = charCategories[random.nextInt(charCategories.length)];
				int position = random.nextInt(charType.length());
				builder.append(charType.charAt(position));
			}
			return new String(builder);
		}
	}

}
