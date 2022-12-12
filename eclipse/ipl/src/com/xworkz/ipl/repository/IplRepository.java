package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDto;

public interface IplRepository {
	
	boolean create(IplDto dto);
	
	default int total() {
		return 0;
	}

}
