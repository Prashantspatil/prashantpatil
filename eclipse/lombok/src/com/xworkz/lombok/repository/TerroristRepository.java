package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.TerroristDTO;

public interface TerroristRepository {
	
	boolean save(TerroristDTO terroristDTO);

}
