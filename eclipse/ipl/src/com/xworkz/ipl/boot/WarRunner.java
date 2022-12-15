package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDto;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {

		WarRepository repository = new WarRepositoryImpl();
		WarDto war = new WarDto("pathankot", "pak", "bharat", "bharat", LocalDateTime.of(2019, 2, 14, 9, 00),
				LocalDateTime.of(2020, 2, 14, 9, 00), 50);
		repository.create(war);
		System.out.println(repository.total());
		WarDto dto = repository.findByStartedBy("china");
		System.out.println(dto);
		System.out.println("\n");
		WarDto dto2 = repository.findByStartedByAndStartedWith("pak", "bharat");
		System.out.println(dto2);
		System.out.println("\n");
		WarDto dto3 = repository.findByStartedDateAndEndDate(LocalDateTime.of(2019, 2, 14, 10, 00),
				LocalDateTime.of(2019, 2, 14, 10, 00));
		System.out.println(dto3);
		System.out.println("\n");
		WarDto dto4 = repository.findStartedDateGreaterThanOrEqualTo(LocalDateTime.of(2019, 3, 14, 10, 00));
		System.out.println(dto4);
		System.out.println("\n");
		WarDto dto5 = repository.findStartedDateLesserThanOrEqualTo(LocalDateTime.of(2019, 3, 15, 10, 00));
		System.out.println(dto5);

	}

}
