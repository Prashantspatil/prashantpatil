package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.FirstAidDTO;

public interface FirstAidRepository {
	
	boolean save(FirstAidDTO firstAidDTO);

}
