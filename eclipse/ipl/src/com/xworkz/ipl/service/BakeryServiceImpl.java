package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BakeryDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	
	private BakeryRepository cake;
	
	public BakeryServiceImpl(BakeryRepository cake) {
		super();
		this.cake = cake;
	}

	@Override
	public boolean validateAndSave(BakeryDto bakeryDto) throws InvalidCredetialsException {
		 String name=bakeryDto.getName();
		 String owner=bakeryDto.getOwner();
		 long contact=bakeryDto.getContact();
		 String location=bakeryDto.getLocation();
		 String famousFor=bakeryDto.getFamousFor();
		 boolean validName=false;
		 boolean validOwner=false;
		 boolean validContact=false;
		 boolean validLocation=false;
		 boolean validFamousFor=false;
		 
		 if(name!=null && name.length()>=3 && name.length()<=20) {
			 System.out.println("valid name : "+name);
			 validName=true;
		 }else {
			 System.err.println("invalid name throws exception");
		 }
		 if(name!=null && owner.length()>=3 && owner.length()<=20) {
			 System.out.println("valid owner : "+owner);
			 validOwner=true;
		 }else {
			 System.err.println("invalid owner throws exception");
		 }
		 if(contact!=0) {
			 System.out.println("valid contact : "+contact);
			 validContact=true;
		 }else {
			 System.err.println("invalid contact throws exception");
		 }
		 if(location!=null && location.length()>=3 && location.length()<=20) {
			 System.out.println("valid location : "+location);
			 validLocation=true;
		 }else {
			 System.err.println("invalid location throws exception");
		 }
		 if(famousFor!=null && famousFor.length()>=3 && famousFor.length()<=20) {
			 System.out.println("valid famous for : "+location);
			 validFamousFor=true;
		 }else {
			 System.err.println("famous for nothing & throws exception");
		 }
		 if(validName && validOwner && validContact && validLocation && validFamousFor) {
			 System.out.println("valid bakery information");
			 boolean bake=this.cake.save(bakeryDto);
			 System.out.println("inputs stored : "+bake);
			 return bake;
		 }
		throw new InvalidCredetialsException("verify inputs entered"); 
	}

}
