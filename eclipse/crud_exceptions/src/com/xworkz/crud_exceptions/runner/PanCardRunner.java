package com.xworkz.crud_exceptions.runner;

import com.xworkz.crud_exceptions.repositories.PanCardRepository;
import com.xworkz.crud_exceptions.repositories.PanCardRepositoryImpli;

public class PanCardRunner {

	public static void main(String[] args) {
		
		PanCardRepository cardRepository=new PanCardRepositoryImpli();
		cardRepository.linking("DYWPP3410D");
		cardRepository.linking("DYWPP3411D");
		cardRepository.linking("DYWPP3410A");
		cardRepository.linking("DYWPP3410W");
		cardRepository.linking("DYWPP3410E");
		cardRepository.linking("DYWPP3410R");
		cardRepository.linking("DYWPP3410T");
		cardRepository.linking("DYWPP3410Y");
		cardRepository.linking("DYWPP3410U");
		cardRepository.linking("DYWPP3410O");
		cardRepository.linking("DYWPP3410K");
		System.out.println(System.lineSeparator());
		System.out.println(cardRepository.total());

	}

}
