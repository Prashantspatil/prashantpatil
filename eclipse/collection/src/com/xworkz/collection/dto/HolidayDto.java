package com.xworkz.collection.dto;

import java.io.Serializable;

public class HolidayDto implements Serializable{
	
	private String name;
	private String type;
	private String famousFor;
	
	public HolidayDto() {
		// TODO Auto-generated constructor stub
	}

	public HolidayDto(String name, String type, String famousFor) {
		super();
		this.name = name;
		this.type = type;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "HolidayDto [name=" + name + ", type=" + type + ", famousFor=" + famousFor + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof HolidayDto) {
				HolidayDto dto=(HolidayDto) obj;
				if(dto.type.equals(type)) {
					System.out.println("type is matching : "+dto);
					return true;
				}else {
					System.out.println("type is not matching : ");
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

}
