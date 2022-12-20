package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class RailwayStationDto extends AbstractAuditDto{
	
	private String name;
	private int totalPlatforms;
	private String area;
	private int platformTicketPrice;

	public RailwayStationDto() {
		System.out.println("default constructor of RailwayStation");
	}

	public RailwayStationDto(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, int totalPlatforms, String area, int platformTicketPrice) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.totalPlatforms = totalPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", totalPlatforms=" + totalPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalPlatforms() {
		return totalPlatforms;
	}

	public void setTotalPlatforms(int totalPlatforms) {
		this.totalPlatforms = totalPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(int platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}
	
}
