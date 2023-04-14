package com.xworkz.crud_exceptions.repositories;

import com.xworkz.crud_exceptions.customExceptions.PanSizeExceededException;

public class PanCardRepositoryImpli implements PanCardRepository{
	
	private String[] panCards=new String[10];
	private int panCardIndex=0;
	
	@Override
	public boolean linking(String card) {
		System.out.println("running the linking : ");
		if(this.panCardIndex>this.panCards.length) {
			if(this.panCardIndex>this.panCards.length) {
			throw new PanSizeExceededException();
		}
		}
		this.panCards[panCardIndex]=card;
		panCardIndex++;
		return false;
	}
	
	@Override
	public int total() {
		//return PanCardRepository.super.total();
		System.out.println("running total");
		return this.panCardIndex;
	}

}
