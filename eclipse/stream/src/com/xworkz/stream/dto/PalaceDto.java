package com.xworkz.stream.dto;

import java.io.Serializable;

public class PalaceDto implements Serializable{
	
	String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private Double visitingPass;
	
	public PalaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDto(String name, String location, String builtBy, boolean destroyed, Double visitingPass) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingPass = visitingPass;
	}

	@Override
	public String toString() {
		return "PalaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingPass=" + visitingPass + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 00;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PalaceDto) {
				PalaceDto dto=(PalaceDto) obj;
				if(dto.name.equals(this.name) && dto.location.equals(this.location)) {
					System.out.println("name & location matches : "+dto);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public Double getVisitingPass() {
		return visitingPass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public void setVisitingPass(Double visitingPass) {
		this.visitingPass = visitingPass;
	}

}
