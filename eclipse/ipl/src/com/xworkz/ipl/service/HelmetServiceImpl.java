package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.Type;
import com.xworkz.ipl.dto.HelmetDto;
import com.xworkz.ipl.repository.HelmetRepository;
public class HelmetServiceImpl implements HelmetService{
	
	private HelmetRepository helmet;
	
	public HelmetServiceImpl(HelmetRepository helmet) {
		super();
		this.helmet = helmet;
	}

	@Override
	public boolean validAndSave(HelmetDto helmetDto) {
		String brand=helmetDto.getBrand();
		Double price=helmetDto.getPrice();
		Type type=helmetDto.getType();
		Color color=helmetDto.getColor();
		boolean validBrand=false;
		boolean validPrice=false;
		boolean validType=false;
		boolean validColor=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<=20) {
			System.out.println("brand is valid : "+brand);
			validBrand=true;
		}else {
			System.out.println("invalid brand");
		}
		
		if(price!=null && price>=1000 && price<=12000) {
			System.out.println("price is valid : "+price);
			validPrice=true;
		}else {
			System.out.println("invalid price");
		}
		
		if(type!=null) {
			System.out.println("type is valid : "+type);
			validType=true;
		}else {
			System.out.println("invalid type");
		}
		
		if(color!=null) {
			System.out.println("color is valid : "+color);
			validColor=true;
		}else {
			System.out.println("invalid color");
		}
		
		if(validBrand && validColor && validPrice && validType ) {
			System.out.println("data is valid & save data");
			boolean save=helmet.save(helmetDto);
			System.out.println("saved data : " +save);
			return save;
		}
		return false;
	}

}
