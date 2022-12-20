package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.BakeryDto;
import com.xworkz.ipl.exception.BakeryExceededException;


public class BakeryRepositoryImpl implements BakeryRepository {
	
	private BakeryDto[] bakeries=new BakeryDto[5];
	private int bakeryIndex=0;

	@Override
	public boolean save(BakeryDto bakeryDto) {
		System.out.println("calling save method");
		if(this.bakeryIndex>=this.bakeries.length) {
			System.err.println("throw exception");
			throw new BakeryExceededException("building storagefull");
		}
		System.out.println("saved to : "+bakeryDto +"at plotIndex : "+bakeryIndex);
		this.bakeries[bakeryIndex]=bakeryDto;
		bakeryIndex++;
		return true;
	}

}
