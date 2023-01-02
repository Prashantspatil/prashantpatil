package com.xworkz.stream.dto;

import java.io.Serializable;

public class AppllicationDto implements Serializable{
	
	private String name;
	private Double version;
	private boolean free;
	private String developer;
	private Integer price;
	
	public AppllicationDto() {
		// TODO Auto-generated constructor stub
	}

	public AppllicationDto(String name, Double version, boolean free, String developer, Integer price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developer = developer;
		this.price = price;
	}

	@Override
	public String toString() {
		return "AppllicationDto [name=" + name + ", version=" + version + ", free=" + free + ", developer=" + developer
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 01;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof AppllicationDto) {
				AppllicationDto dto=(AppllicationDto) obj;
				if(dto.version.equals(this.version) && dto.free==this.free) {
					System.out.println("version & free matches : "+dto);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public Double getVersion() {
		return version;
	}

	public boolean isFree() {
		return free;
	}

	public String getDeveloper() {
		return developer;
	}

	public Integer getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
