package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.CompanyCEODto;
import com.xworkz.stream.dto.DaughterDto;

public class CompanyCEORunner {

	public static void main(String[] args) {

		Collection<CompanyCEODto> ceoDtos=new ArrayList<CompanyCEODto>();
		DaughterDto daughterDto1=new DaughterDto("rambhe", 7349021511L, 21, false, true);
		DaughterDto daughterDto2=new DaughterDto("urvashi", 7349021512L, 22, false, true);
		DaughterDto daughterDto3=new DaughterDto("menake", 7349021513L, 23, false, true);
		DaughterDto daughterDto4=new DaughterDto("pushpavathi", 7349021514L, 24, false, true);
		DaughterDto daughterDto5=new DaughterDto("mahishmathi", 7349021515L, 25, false, true);
		ceoDtos.add(new CompanyCEODto("ratan", "tcs", 80, "india", "mba", false, daughterDto1));
		ceoDtos.add(new CompanyCEODto("narayan", "infosys", 70, "hindustan", "bba", true, daughterDto2));
		ceoDtos.add(new CompanyCEODto("anand", "m&m", 65, "bharath", "bbm", true, daughterDto3));
		ceoDtos.add(new CompanyCEODto("azim", "wipro", 75, "indus", "bcom", true, daughterDto4));
		ceoDtos.add(new CompanyCEODto("ambani", "relience", 67, "mumbai", "mcom", true, daughterDto5));

		ceoDtos.stream()
		.map(dto->dto.getDaughterDto())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto.getName()));
		System.out.println(System.lineSeparator());
		ceoDtos.stream()
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		ceoDtos.stream()
		.filter(dto->dto.getAge()>70)
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		ceoDtos.stream()
		.forEach(dto->System.out.println("father age : "+dto.getAge() + " & "  +"daughter age : "+dto.getDaughterDto().getAge()));
		
	}

}
