package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.TheatreDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.TheatreRepository;
import com.xworkz.ipl.repository.TheatreRepositoryImpl;
import com.xworkz.ipl.service.TheatreService;
import com.xworkz.ipl.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {
		
		TheatreDto dto= new TheatreDto("dell", LocalDateTime.now(), "me", LocalDateTime.now(), "husband", "pvr", "prasanna", 250);
		TheatreRepository repository=new TheatreRepositoryImpl();
		TheatreService service=new TheatreServiceImpl(repository);
		
		TheatreDto dto1= new TheatreDto("lenovo", LocalDateTime.now(), "neenu", LocalDateTime.now(), "hdusdjd", "pvvr", "madesha", 249);
		TheatreDto dto2= new TheatreDto("hp", LocalDateTime.now(), "naanu", LocalDateTime.now(), "wif", "pvvvr", "ganesha", 248);
		TheatreDto dto3= new TheatreDto("sony", LocalDateTime.now(), "okay", LocalDateTime.now(), "wiife", "pvrrr", "victory", 247);
		TheatreDto dto4= new TheatreDto("sonyy", LocalDateTime.now(), "okayy", LocalDateTime.now(), "wiiife", "ppvrrr", "vvictory", 246);
		//TheatreDto dto5= new TheatreDto("sonnyy", LocalDateTime.now(), "ookayy", LocalDateTime.now(), "wwiiife", "ppvvrrr", "vviictory", 245);
		try {
			boolean theatre=service.validAndSave(dto);
			boolean theatre1=service.validAndSave(dto1);
			boolean theatre2=service.validAndSave(dto2);
			boolean theatre3=service.validAndSave(dto3);
			boolean theatre4=service.validAndSave(dto4);
			//boolean theatre5=service.validAndSave(dto5);
		} catch (InvalidCredetialsException e) {
				e.printStackTrace();
		}

	}

}
