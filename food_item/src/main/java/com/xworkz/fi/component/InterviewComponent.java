package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.Dto.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {
	
	public InterviewComponent() {
		System.out.println("created : "+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onAttend(InterviewDTO interviewDTO) {
		System.out.println("running onAttend");
		System.out.println("Dto is :"+interviewDTO);
		return "Interview.jsp";
	}

}
