package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDto;
import com.xworkz.ipl.exception.CurrentIndexExceededException;

public class IplRepositoryImpl implements IplRepository{
	
	private IplDto[] iplDtos=new IplDto[10];
	private int currentIndex=0;
	
	@Override
	public boolean create(IplDto dto) {
		System.out.println("running create of IplDto");
		if(this.currentIndex>=this.iplDtos.length) {
			System.err.println("size exceeded can't add more teams");
			throw new CurrentIndexExceededException();
	}
	
	this.iplDtos[this.currentIndex]=dto;
	this.currentIndex++;
	System.out.println("Saved " +dto + "in index " +this.currentIndex);
	return false;
	}
	
	

}
