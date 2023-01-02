package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.PalaceDto;

public class PalaceRunner {

	public static void main(String[] args) {
		
		Collection<PalaceDto> palaceDtos=new ArrayList<PalaceDto>();
		palaceDtos.add(new PalaceDto("bengaluru palace", "bengaluru", "kempegowda", false, 100D));
		palaceDtos.add(new PalaceDto("mysore palace", "mysore", "wadeyar", false, 150D));
		palaceDtos.add(new PalaceDto("hawa palace", "rajasthan", "shilpa shetty", true, 200D));
		palaceDtos.add(new PalaceDto("taj palace", "udaipur", "ratan tata", true, 300D));
		palaceDtos.add(new PalaceDto("lalgarh palace", "bikaner", "prashant", false, 400D));
		
		palaceDtos.stream()
		.filter(dto->!dto.isDestroyed())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));

	}

}
