package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PlaceDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {
	
	private PlaceRepository plot;
	
	public PlaceServiceImpl(PlaceRepository plot) {
		super();
		this.plot = plot;
	}

	@Override
	public boolean validateAndSave(PlaceDto placeDto) throws InvalidCredetialsException {
		 String name=placeDto.getName();
		 String famousFor=placeDto.getFamousFor();
		 long pinCode=placeDto.getPinCode();
		 int tier=placeDto.getTier();
		 String state=placeDto.getState();
		 boolean validName=false;
		 boolean validFamosFor=false;
		 boolean validPinCode=false;
		 boolean validTier=false;
		 boolean validState=false;
		 
		 if(name!=null && name.length()>=3 && name.length()<=20) {
			 System.out.println("valid name : "+name);
			 validName=true;
		 }else {
			 System.err.println("invalid name throws exception");
		 }
		 if(famousFor!=null && famousFor.length()>=3 && famousFor.length()<=20) {
			 System.out.println("valid famous for : "+famousFor);
			 validFamosFor=true;
		 }else {
			 System.err.println("invalid famous for throws exception");
		 }
		 if(pinCode!=0) {
			 System.out.println("valid pincode : "+pinCode);
			 validPinCode=true;
		 }else {
			 System.err.println("invalid pincode throws exception");
		 }
		 if(tier!=0 && tier>=1) {
			 System.out.println("valid tier : "+tier);
			 validTier=true;
		 }else {
			 System.err.println("invalid tier throws exception");
		 }
		 if(state!=null && state.length()>=3 && state.length()<=20) {
			 System.out.println("valid state : "+state);
			 validState=true;
		 }else {
			 System.err.println("invalid sate throws exception");
		 }
		 if(validName  && validFamosFor  && validPinCode && validTier && validState) {
			 System.out.println("valid building information");
			 boolean spot=this.plot.save(placeDto);
			 System.out.println("inputs stored : "+spot);
			 return spot;
		 }
		throw new InvalidCredetialsException("verify inputs entered");
		
	}

}
