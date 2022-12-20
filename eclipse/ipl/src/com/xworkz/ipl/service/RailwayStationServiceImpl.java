package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.RailwayStationDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;
import com.xworkz.ipl.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {
	
	private RailwayStationRepository railwayStation;
	
	public RailwayStationServiceImpl(RailwayStationRepository railwayStation) {
		super();
		this.railwayStation=railwayStation;
	}

	@Override
	public boolean validateAndSave(RailwayStationDto railwayDto) throws InvalidCredetialsException {
		 String name=railwayDto.getName();
		 int totalPlatforms=railwayDto.getTotalPlatforms();
		 String area=railwayDto.getArea();
		 int platformTicketPrice=railwayDto.getPlatformTicketPrice();
		 boolean validName=false;
		 boolean validTotalPlatforms=false;
		 boolean validArea=false;
		 boolean validPlatformTicketPrice=false;
		 
		 if(name!=null && name.length()>=3 && name.length()<=20) {
			 System.out.println("valid name : "+name);
			 validName=true;
		 }else {
			 System.err.println("invalid name throws exception");
		 }
		 if(totalPlatforms!=0 && totalPlatforms>=1) {
			 System.out.println("valid totalPlatforms : "+totalPlatforms);
			 validTotalPlatforms=true;
		 }else {
			 System.err.println("invalid totalPlatforms throws exception");
		 }
		 if(area!=null && area.length()>=3 && area.length()<=20) {
			 System.out.println("valid area : "+area);
			 validArea=true;
		 }else {
			 System.err.println("invalid area throws exception");
		 }
		 if(platformTicketPrice!=0 && platformTicketPrice>=1) {
			 System.out.println("valid platformTicketPrice : "+platformTicketPrice);
			 validPlatformTicketPrice=true;
		 }else {
			 System.err.println("invalid platformTicketPrice throws exception");
		 }
		 if(validArea && validName && validPlatformTicketPrice && validTotalPlatforms) {
			 System.out.println("valid inputs entered");
			 boolean booked=this.railwayStation.save(railwayDto);
			 System.out.println("inputs stored : "+booked);
			 return booked;
		 }
		throw new InvalidCredetialsException("verify inputs entered");
	}

}
