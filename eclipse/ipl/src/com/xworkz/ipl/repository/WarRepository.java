package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDto;

public interface WarRepository {
	
	boolean create(WarDto warDto);
	boolean create(WarDto[] warDto);
	
	default int total() {
		return 0;
	}
	
	default WarDto findByStartedBy(String startedBy) {
		return null;
	}
	
	default WarDto findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;
	}
	
	default WarDto findStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		return null;
	}
	
	default WarDto findStartedDateLesserThanOrEqualTo(LocalDateTime startedIn) {
		return null;
	}
	
	default WarDto findByStartedDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		return null;
	}

}
