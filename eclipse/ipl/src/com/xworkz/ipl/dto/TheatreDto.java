package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class TheatreDto extends AbstractAuditDto{
	
	private String id;
	private String brand;
	private String name;
	private int seats;
	
	public TheatreDto() {
		System.out.println("calling TheatreDto default constructor");
	}

	public TheatreDto(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String id, String brand, String name, int seats) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheatreDto [id=" + id + ", brand=" + brand + ", name=" + name + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
