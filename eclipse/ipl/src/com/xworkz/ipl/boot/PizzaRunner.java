package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDto;
import com.xworkz.ipl.service.PizzaService;
import com.xworkz.ipl.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDto pizzaDto=new PizzaDto();
		pizzaDto.setCheese(true);
		pizzaDto.setCompany("pizzaHut");
		pizzaDto.setCreatedBy("siddharth");
		pizzaDto.setCreatedDate(LocalDateTime.now());
		pizzaDto.setFlavour("corn");
		pizzaDto.setName("margerett");
		pizzaDto.setPrice(49);
		pizzaDto.setSize(PizzaSize.MEDIUM);
		pizzaDto.setType("veg");
		pizzaDto.setUpdatedBy("jagadeesh");
		pizzaDto.setUpdatedDate(LocalDateTime.now());
		
		PizzaService pizzaService=new PizzaServiceImpl();
		boolean saved=pizzaService.validateAndSave(pizzaDto);
		System.out.println(saved);

	}

}
