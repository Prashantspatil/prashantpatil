package com.xworkz.collection.dto;

import java.io.Serializable;

public class AirportDto implements Serializable{
	
	private String name;
	private Integer inauguration;
	private String type;

	public AirportDto() {
		// TODO Auto-generated constructor stub
	}

	public AirportDto(String name, Integer inauguration, String type) {
		super();
		this.name = name;
		this.inauguration = inauguration;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", inauguration=" + inauguration + ", type=" + type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof AirportDto) {
				AirportDto dto=(AirportDto) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching : "+dto);
					return true;
				}else {
					System.out.println("name is not matching : ");
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

	public Integer getInauguration() {
		return inauguration;
	}

	public void setInauguration(Integer inauguration) {
		this.inauguration = inauguration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
