package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class PlaceDto extends AbstractAuditDto{
	
	private String name;
	private String famousFor;
	private long pinCode;
	private int tier;
	private String state;
	
	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDto(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, String famousFor, long pinCode, int tier, String state) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.famousFor = famousFor;
		this.pinCode = pinCode;
		this.tier = tier;
		this.state = state;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", famousFor=" + famousFor + ", pinCode=" + pinCode + ", tier=" + tier
				+ ", state=" + state + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
