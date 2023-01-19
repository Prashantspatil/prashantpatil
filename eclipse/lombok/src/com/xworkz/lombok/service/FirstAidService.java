package com.xworkz.lombok.service;

import com.xworkz.lombok.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO firstAidDTO);

}
