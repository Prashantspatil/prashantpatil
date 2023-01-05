package com.xworkz.stream.dto;

import java.io.Serializable;

import com.xworkz.stream.constant.WeaponType;

public class WeaponDto implements Comparable<WeaponDto>,Serializable{
	
	private String name;
	private String madeBy;
	private String madeOf;
	private Double price;
	private WeaponType type;
	
	public WeaponDto() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDto(String name, String madeBy, String madeOf, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOf = madeOf;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOf=" + madeOf + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 00;
	}

	@Override
	public boolean equals(Object obj) {
        if(obj!=null) {
        	if(obj instanceof WeaponDto) {
        		WeaponDto dto=(WeaponDto) obj;
        		if(dto.type.equals(this.type)) {
        			return true;
        		}
        	}
        }
		return false;
	}
	
	@Override
	public int compareTo(WeaponDto o) {
		return o.name.compareTo(this.name);
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public Double getPrice() {
		return price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
