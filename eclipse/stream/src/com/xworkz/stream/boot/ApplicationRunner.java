package com.xworkz.stream.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.AppllicationDto;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		Collection<AppllicationDto> appllicationDtos=new LinkedList<AppllicationDto>();
		appllicationDtos.add(new AppllicationDto("pubg", 1.2D, false, "rudra", 150));
		appllicationDtos.add(new AppllicationDto("zerodha", 1.3D, true, "google", 00));
		appllicationDtos.add(new AppllicationDto("angel one", 1.6D, false, "prashant", 250));
		appllicationDtos.add(new AppllicationDto("dunzo", 1.4D, false, "jaideep", 350));
		appllicationDtos.add(new AppllicationDto("zomato", 1.5D, false, "jagadeesh", 450));
		
		System.out.println("running stream for free application");
		appllicationDtos.stream()
		.filter(dto->dto.isFree() && dto.getDeveloper()=="google")
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		System.out.println(System.lineSeparator());
		System.out.println("running stream for version >1.5");
		appllicationDtos.stream()
		.filter(dto->dto.getVersion()>1.5)
        .collect(Collectors.toList())
        .forEach(dto->System.out.println(dto.getName()));

	}

}
