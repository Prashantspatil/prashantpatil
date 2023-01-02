package com.xworkz.collection.dto;

import java.io.Serializable;

public class CakeDto implements Serializable{
	
	private String name;
	private Integer price;
	private String color;
	private String shape;
	
	public CakeDto() {
		// TODO Auto-generated constructor stub
	}

	public CakeDto(String name, Integer price, String color, String shape) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.shape = shape;
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 30;
	}
	
	@Override
	public String toString() {
		return "CakeDto [name=" + name + ", price=" + price + ", color=" + color + ", shape=" + shape + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CakeDto) {
				CakeDto dto=(CakeDto) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("cake name is same : "+this.name);
				}
			}
		}
		return false;
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
     
}
