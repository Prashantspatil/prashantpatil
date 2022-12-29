package com.xworkz.collection.dto;

import java.io.Serializable;

public class CalenderDto implements Serializable{
	
	private String name;
	private Integer price;
	private String color;
	
	public CalenderDto() {
		// TODO Auto-generated constructor stub
	}

	public CalenderDto(String name, Integer price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CalenderDto) {
				CalenderDto dto=(CalenderDto) obj;
				if(dto.price.equals(price)) {
					System.out.println("color is matching : "+dto);
					return true;
				}else {
					System.out.println("color is not matching : ");
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "CalenderDto [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
     
}
