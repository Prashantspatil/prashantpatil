package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.Type;

public class HelmetDto extends AbstractAuditDto{
	
	private String brand;
	private Double price;
	private Color color;
	private Type type;
	
	public HelmetDto() {
		System.out.println("default constructor of HelmetDto");
	}

	public HelmetDto(String brand, Double price, Color color, Type type, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return "HelmetDto [brand=" + brand + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
