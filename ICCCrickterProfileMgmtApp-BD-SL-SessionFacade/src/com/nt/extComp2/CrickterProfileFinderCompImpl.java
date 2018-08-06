package com.nt.extComp2;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CrickterInputsDTO;
import com.nt.dto.CrickterProfileDTO;
import com.nt.errors.CrickterIdFinderException;
import com.nt.errors.CrickterProfileFinderException;
import com.nt.extComp1.CrickterIdFinderComp;

public class CrickterProfileFinderCompImpl implements CrickterProfileFinderComp {

	@Override
	public CrickterProfileDTO fetchProfile(CricketerIdDTO idDTO) throws CrickterProfileFinderException {
		 CrickterProfileDTO profileDTO=null;
		 profileDTO=new CrickterProfileDTO();
		if(idDTO.getId()==1001){
			profileDTO.setFullName("sachin ramesh Tendulkar");
			profileDTO.setCountry("india");
			profileDTO.setId(1001);
			profileDTO.setNickName("sachin");
			profileDTO.setTotalInnings(452);
			profileDTO.setTotalMaches(463);
			profileDTO.setTotalRuns(18426);
			profileDTO.setBattingAvg(44.8f);
			profileDTO.setTotalWickets(154);
			profileDTO.setBowlingAvg(44.48f);
			profileDTO.setTotalCatches(140);
			profileDTO.setType("All Rounder-Batsman");
		}
		else if(idDTO.getId()==1002){
			profileDTO.setFullName("sourav ganguly");
			profileDTO.setCountry("india");
			profileDTO.setId(1002);
			profileDTO.setNickName("dada");
			profileDTO.setTotalInnings(300);
			profileDTO.setTotalMaches(311);
			profileDTO.setTotalRuns(11363);
			profileDTO.setBattingAvg(40.73f);
			profileDTO.setTotalWickets(171);
			profileDTO.setBowlingAvg(38.49f);
			profileDTO.setTotalCatches(100);
			profileDTO.setType("All Rounder-Batsman");
		}
		else if(idDTO.getId()==1003){
			profileDTO.setFullName("Virat kohli");
			profileDTO.setCountry("india");
			profileDTO.setId(1003);
			profileDTO.setNickName("playboy");
			profileDTO.setTotalInnings(203);
			profileDTO.setTotalMaches(211);
			profileDTO.setTotalRuns(9779);
			profileDTO.setBattingAvg(58.21f);
			profileDTO.setTotalWickets(4);
			profileDTO.setBowlingAvg(166.49f);
			profileDTO.setTotalCatches(101);
			profileDTO.setType("Batsman");
		}
		else{
			throw new CrickterProfileFinderException("Invalid crickter id");
		}
		return profileDTO;
	}
}
