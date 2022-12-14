package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class WarDto extends AbstractAuditDto{
	
	private String name;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private LocalDateTime startedIn;
	private LocalDateTime endedIn;
	private int noOfDeaths;
	
	@Override
	public String toString() {
		return "WarDto [name=" + name + ", startedBy=" + startedBy + ", startedWith=" + startedWith + ", wonBy=" + wonBy
				+ ", startedIn=" + startedIn + ", endedIn=" + endedIn + ", noOfDeaths=" + noOfDeaths + ", toString()=" + super.toString() + "]";
	}

	public WarDto(String name, String startedBy, String startedWith, String wonBy, LocalDateTime startedIn,
			LocalDateTime endedIn, int noOfDeaths) {
		super();
		this.name = name;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.wonBy = wonBy;
		this.startedIn = startedIn;
		this.endedIn = endedIn;
		this.noOfDeaths = noOfDeaths;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public LocalDateTime getStartedIn() {
		return startedIn;
	}

	public void setStartedIn(LocalDateTime startedIn) {
		this.startedIn = startedIn;
	}

	public LocalDateTime getEndedIn() {
		return endedIn;
	}

	public void setEndedIn(LocalDateTime endedIn) {
		this.endedIn = endedIn;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
