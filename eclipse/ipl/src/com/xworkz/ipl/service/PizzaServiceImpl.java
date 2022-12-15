package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDto;
import com.xworkz.ipl.exception.PizzaDtoException;

public class PizzaServiceImpl implements PizzaService{

	@Override
	public boolean validateAndSave(PizzaDto dto) {
		System.out.println("running validateAndSave");
		String name=dto.getName();
	    String company=dto.getCompany();
		String flavour=dto.getFlavour();
		String type=dto.getType();
		PizzaSize size=dto.getSize();
		boolean cheese=dto.isCheese();
		double price=dto.getPrice();
		boolean validName=false;
		boolean validCompany=false;
		boolean validFlavour=false;
		boolean validType=false;
		boolean validSize=false;
		//boolean validCheese=false;
		boolean validPrice=false;
		
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("valid pizza name : " + name);
			validName=true;
		}
		else {
			System.out.println("invalid pizza name");
		}
		if(company!=null && company.length()>=4 && company.length()<=20) {
			System.out.println("valid company : " + company);
			validCompany=true;
		}
		else {
			System.out.println("invalid company");
		}
		if(size!=null) {
			System.out.println("valid size : " + size);
			validSize=true;
		}
		else {
			System.out.println("invalid size");
		}
		if(flavour!=null && flavour.length()>=3 && flavour.length()<=20) {
			System.out.println("valid flavour : " + flavour);
			validFlavour=true;
		}
		else {
			System.out.println("invalid flavour");
		}
		if(type!=null && type=="veg" || type=="non-veg") {
			System.out.println("valid type : " + type);
			validType=true;
		}
		else {
			System.out.println("invalid type");
		}
		if(price>=50 && price<=12000) {
			System.out.println("valid price : " + price);
			validPrice=true;
		}
		else {
			System.out.println("invalid price");
			throw new PizzaDtoException();
			//System.out.println("invalid price");
		}
		if(validCompany && validFlavour && validName && validPrice && validSize && validType) {
			System.out.println("pizzaDto valid");
			return true;
		}
		return false;
	}
	
	

}
