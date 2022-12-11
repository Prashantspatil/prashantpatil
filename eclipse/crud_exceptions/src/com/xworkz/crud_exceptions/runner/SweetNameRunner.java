package com.xworkz.crud_exceptions.runner;

import com.xworkz.crud_exceptions.repositories.SweetNameRepository;
import com.xworkz.crud_exceptions.repositories.SweetNameRepositoryImpli;

public class SweetNameRunner {

	public static void main(String[] args) {
		
		SweetNameRepository nameRepository=new SweetNameRepositoryImpli();
		nameRepository.prepare("the exotica");
		nameRepository.prepare("jalebi baaye");
		nameRepository.prepare("karadantu");
		nameRepository.prepare("shenga chekki");
		nameRepository.prepare("besan undi");
		nameRepository.prepare("ellu undi");
		nameRepository.prepare("shenga undi");
		nameRepository.prepare("karjikayi");
		nameRepository.prepare("kala jamun");
		nameRepository.prepare("mandakki indi");
		
		System.out.println(nameRepository.totalSweets());

	}

}
