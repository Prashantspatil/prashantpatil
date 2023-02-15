package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachController {
	
	public BeachController() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onBeach(BeachDTO beachDTO, Model model) {
		System.out.println("running onBeach"+beachDTO);
		model.addAttribute("name",beachDTO.getName());
		model.addAttribute("location",beachDTO.getLocation());
		return "BeachSuccess.jsp";
		
	}

}
