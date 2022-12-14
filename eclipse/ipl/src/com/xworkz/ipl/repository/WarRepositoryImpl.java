package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDto;
import com.xworkz.ipl.exception.WarIncorrectDataException;

public class WarRepositoryImpl implements WarRepository{
	
	private WarDto[] wars= new WarDto[10];
	private int warIndex=0;
	
	@Override
	public boolean create(WarDto warDto) {
		System.out.println("running create");
		if(this.warIndex>=wars.length) {
			throw new WarIncorrectDataException();
		}
		System.out.println("saved to" + warDto + "at index " + warIndex);
		this.wars[warIndex]=warDto;
		warIndex++;
		return true;
	}
	
	@Override
	public boolean create(WarDto[] warDto) {
		return false;
	}
	
	@Override
	public int total() {
		System.out.println("running total method");
		return this.warIndex;
	}
	
	@Override
	public WarDto findByStartedBy(String startedBy) {
		System.out.println("running findByStartedBy" + startedBy);
		for (WarDto warDto : wars) {
			if(warDto!=null && warDto.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("warDto is present" + startedBy);
			}
		}
		System.out.println("warDto is not present");
		return WarRepository.super.findByStartedBy(startedBy);
	}
	
	@Override
	public WarDto findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("running findByStartedByAndStartedWith" + startedBy + startedWith);
		for (WarDto warDto : wars) {
			if(warDto!=null && warDto.getStartedBy().equalsIgnoreCase(startedBy)&& warDto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("warDto exist" + startedBy + startedWith);
			}
		}
		System.out.println("warDto not found");
		return WarRepository.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}
	
	@Override
	public WarDto findStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		System.out.println("running findStartedDateGreaterThanOrEqualTo" + startedIn);
		for (WarDto warDto : wars) {
			if(warDto!=null && warDto.getStartedIn().isAfter(startedIn)) {
				System.out.println("warDto is found" + startedIn);
			}
		}
		System.out.println("warDto is not found & is greaterthan/lesserthan given date");
		return WarRepository.super.findStartedDateGreaterThanOrEqualTo(startedIn);
	}
	
	@Override
	public WarDto findStartedDateLesserThanOrEqualTo(LocalDateTime startedIn) {
		System.out.println("running findStartedDateLesserThanOrEqualTo" + startedIn);
		for (WarDto warDto : wars) {
			if(warDto!=null && warDto.getStartedIn().isBefore(startedIn)) {
				System.out.println("warDto is found" + startedIn);
			}
		}
		System.out.println("warDto is not found & is greaterthan/lesserthan given date");
		return WarRepository.super.findStartedDateLesserThanOrEqualTo(startedIn);
	}
	
	@Override
	public WarDto findByStartedDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		System.out.println("running findByStartedDateAndEndDate" + startedIn + endedIn);
		for (WarDto warDto : wars) {
			if(warDto!=null) {
				System.out.println("warDto is found" + startedIn + endedIn);
			}
		}
		System.out.println("warDto is not found");
		return WarRepository.super.findByStartedDateAndEndDate(startedIn, endedIn);
	}
	
	

}
