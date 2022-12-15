package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDto{
	
	private String name;
	private String company;
	private String flavour;
	private String type;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	
	public PizzaDto() {
		System.out.println("PizzaDto() is default constructor");
	}

	public PizzaDto(String name, String company, String flavour, String type, PizzaSize size, boolean cheese,
			double price, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.company = company;
		this.flavour = flavour;
		this.type = type;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", flavour=" + flavour + ", type=" + type + ", size="
				+ size + ", cheese=" + cheese + ", price=" + price + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
