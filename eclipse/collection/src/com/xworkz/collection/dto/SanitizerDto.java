package com.xworkz.collection.dto;

public class SanitizerDto {
	
	private String id;
	private String brand;
	private String color;
	private Double price;

    public SanitizerDto() {
		
	}

	public SanitizerDto(String id, String brand, String color, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDto [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
    
}
