package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.constant.Type;
import com.xworkz.stream.dto.DataBaseVendorDto;

public class DataBaseVendorRunner {

	public static void main(String[] args) {

		Collection<DataBaseVendorDto> dataBaseVendorDtos=new ArrayList<DataBaseVendorDto>();
		dataBaseVendorDtos.add(new DataBaseVendorDto("microsoft", "satya", Type.COMMERCIAL, 1.55D, 10));
		dataBaseVendorDtos.add(new DataBaseVendorDto("oracle", "omkar", Type.PERSONAL, 1.65D, 200));
		dataBaseVendorDtos.add(new DataBaseVendorDto("ibm", "prashant", Type.RELATIONAL, 1.75D, 300));
		dataBaseVendorDtos.add(new DataBaseVendorDto("tcs", "ratan", Type.DISTRIBUTED, 1.85D, 400));
		dataBaseVendorDtos.add(new DataBaseVendorDto("infosys", "narayan", Type.COMMERCIAL, 1.95D, 50));
		
		dataBaseVendorDtos.stream()
		.map(dto->dto.getDeveloper().toUpperCase())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		dataBaseVendorDtos.stream()
		.filter(dto->dto.getCost()<100 && dto.getType()==Type.COMMERCIAL)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		dataBaseVendorDtos.stream()
		.map(dto->dto.getType())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
	}

}
