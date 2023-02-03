package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.CasinoDTO;

@Component
@RequestMapping("/casino")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDTO casinoDTO,Model model) {
		System.out.println("running onCasino "+casinoDTO);
		model.addAttribute("name",casinoDTO.getName());
		model.addAttribute("entryFee",casinoDTO.getEntryFee());
		return "CasinoSuccess.jsp";
		
	}

}
