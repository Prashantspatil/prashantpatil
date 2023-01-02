package com.xworkz.stream.dto;

import java.io.Serializable;

import com.xworkz.stream.constant.Type;

public class DataBaseVendorDto implements Serializable{
	
	private String name;
	private String developer;
	private Type type; 
	private Double size;
	private int cost;
	
	public DataBaseVendorDto() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDto(String name, String developer, Type type, Double size, int cost) {
		super();
		this.name = name;
		this.developer = developer;
		this.type = type;
		this.size = size;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDto [name=" + name + ", developer=" + developer + ", type=" + type + ", size=" + size
				+ ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 02;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDto) {
				DataBaseVendorDto dto=(DataBaseVendorDto) obj;
				if(dto.name.equals(this.name) && dto.type.equals(this.type)) {
					System.out.println("name & type matches : "+dto);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getDeveloper() {
		return developer;
	}

	public Type getType() {
		return type;
	}

	public Double getSize() {
		return size;
	}

	public int getCost() {
		return cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
