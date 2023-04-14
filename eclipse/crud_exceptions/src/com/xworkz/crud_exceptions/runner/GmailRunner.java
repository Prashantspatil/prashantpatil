package com.xworkz.crud_exceptions.runner;

import com.xworkz.crud_exceptions.repositories.GmailRepository;
import com.xworkz.crud_exceptions.repositories.GmailRepositoryImpli;

public class GmailRunner {

	public static void main(String[] args) {
		
		GmailRepository gmailRepository=new GmailRepositoryImpli();
		gmailRepository.create("prashant.xworkz@gmail.com");
		gmailRepository.create("jagadeesh.xworkz@gmail.com");
		gmailRepository.create("jaideep.xworkz@gmail.com");
		gmailRepository.create("rudreshwar.xworkz@gmail.com");
		gmailRepository.create("om.xworkz@gmail.com");
		gmailRepository.create("aksar.xworkz@gmail.com");
		gmailRepository.create("vinayak.xworkz@gmail.com");
		gmailRepository.create("siddu.xworkz@gmail.com");
		gmailRepository.create("yeddi.xworkz@gmail.com");
		gmailRepository.create("basu.xworkz@gmail.com");
		gmailRepository.create("tanu.xworkz@gmail.com");
		System.out.println(System.lineSeparator());
		System.out.println("total gmails : "+gmailRepository.totalGmails());

	}

}
