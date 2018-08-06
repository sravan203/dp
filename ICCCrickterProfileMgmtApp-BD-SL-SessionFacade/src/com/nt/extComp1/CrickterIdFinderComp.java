package com.nt.extComp1;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CrickterInputsDTO;
import com.nt.errors.CrickterIdFinderException;

public interface CrickterIdFinderComp {
	
	public  CricketerIdDTO findCrickerId(CrickterInputsDTO dto)throws CrickterIdFinderException;

}
