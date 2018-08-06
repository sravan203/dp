package com.nt.extComp1;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CrickterInputsDTO;
import com.nt.errors.CrickterIdFinderException;

public class CrickterIdFinderCompImpl implements CrickterIdFinderComp {

	@Override
	public CricketerIdDTO findCrickerId(CrickterInputsDTO dto) throws CrickterIdFinderException {
		CricketerIdDTO idDTO=null;
		idDTO=new CricketerIdDTO();
		if(dto.getNickName().equalsIgnoreCase("sachin") && dto.getCountry().equalsIgnoreCase("india")){
			idDTO.setId(1001);
			idDTO.setName("sachin");
		}
		else if(dto.getNickName().equalsIgnoreCase("dada") && dto.getCountry().equalsIgnoreCase("india")){
			idDTO.setId(1002);
			idDTO.setName("gaguly");
		}
		else if(dto.getNickName().equalsIgnoreCase("playboy") && dto.getCountry().equalsIgnoreCase("india")){
			idDTO.setId(1003);
			idDTO.setName("virat kohli");
		}
		else{
			throw new CrickterIdFinderException("Invalid nickname or/and country");
		}
		return idDTO;
	}

}
