package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.TheatreDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.TheatreRepository;

public class TheatreServiceImpl implements TheatreService {
	
	 private TheatreRepository theatre;
	
	public TheatreServiceImpl(TheatreRepository theatre) {
		super();
		this.theatre = theatre;
	}

	@Override
	public boolean validAndSave(TheatreDto dto) throws InvalidCredetialsException {
		 String id=dto.getId();
		 String brand=dto.getBrand();
		 String name=dto.getName();
		 int seats=dto.getSeats();
		 boolean validId=false;
		 boolean validBrand=false;
		 boolean validName=false;
		 boolean validSeats=false;
		 
		 if(id!=null && id.length()>=3 && id.length()<=20) {
			 System.out.println("valid id : "+id);
			 validId=true;
		 }else {
			 System.err.println("id is invalid throws exception");
		 }
		 if(brand!=null && brand.length()>=3 && brand.length()<=20) {
			System.out.println("valid brand : "+brand);
			validBrand=true;
		 }else {
			 System.err.println("brand is invalid throws exception");
		 }
		 if(name!=null && name.length()>=3 && name.length()<=20) {
				System.out.println("valid name : "+name);
				validName=true;
			 }else {
				 System.err.println("name is invalid throws exception");
			 }
		 if(seats>=2 && seats<=250) {
			 System.out.println("valid seats : "+seats);
			 validSeats=true;
		 }else {
			 System.err.println("seats are invalid throws exception");
		 }
		 if(validBrand && validId && validName && validSeats) {
			 System.out.println("valid credentials stored");
			 boolean saved=this.theatre.save(dto);
			 System.out.println("credentials saved : "+saved);
			 return saved;
		 }
		throw new InvalidCredetialsException("check credentials entered");
	}

}
