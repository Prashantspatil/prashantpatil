package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BuildingDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingRepository bunglow;
	
	public BuildingServiceImpl(BuildingRepository bunglow) {
		super();
		this.bunglow = bunglow;
	}

	@Override
	public boolean validateAndSave(BuildingDto buildingDto) throws InvalidCredetialsException {
		 int no=buildingDto.getNo();
		 String name=buildingDto.getName();
		 int floors=buildingDto.getFloors();
		 boolean lift=buildingDto.isLift();
		 boolean parking=buildingDto.isParking();
		 String type=buildingDto.getType();
		 boolean validNo=false;
		 boolean validName=false;
		 boolean validFloors=false;
		 boolean validLift=false;
		 boolean validParking=false;
		 boolean validType=false;
		 
		 if(no!=0 && no>=1) {
			 System.out.println("valid no : "+no);
			 validNo=true;
		 }else {
			 System.err.println("invalid no throws exception");
		 }
		 if(name!=null && name.length()>=3 && name.length()<=20) {
			 System.out.println("valid name : "+name);
			 validName=true;
		 }else {
			 System.err.println("invalid name throws exception");
		 }
		 if(floors!=0 && floors>=1) {
			 System.out.println("valid floors : "+floors);
			 validFloors=true;
		 }else {
			 System.err.println("invalid floors throws exception");
		 }
		 if(type!=null && type.length()>=3 && type.length()<=20) {
			 System.out.println("valid type : "+type);
			 validType=true;
		 }else {
			 System.err.println("invalid platformTicketPrice throws exception");
		 }
		 if(validNo && validName && validFloors && validType) {
			 System.out.println("valid building information");
			 boolean built=this.bunglow.save(buildingDto);
			 System.out.println("inputs stored : "+built);
			 return built;
		 }
		throw new InvalidCredetialsException("verify inputs entered");
	}

}
