package com.nt.extComp2;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CrickterProfileDTO;
import com.nt.errors.CrickterProfileFinderException;

public interface CrickterProfileFinderComp {
	public  CrickterProfileDTO  fetchProfile(CricketerIdDTO dto) throws CrickterProfileFinderException;
}
