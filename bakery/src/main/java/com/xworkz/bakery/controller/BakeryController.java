package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	private BakeryService bakeryService;

	public BakeryController() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@GetMapping("/dto")
	public String onDto(BakeryDTO dto, Model model) {
		model.addAttribute("data", dto);
		return "index";
	}

}
