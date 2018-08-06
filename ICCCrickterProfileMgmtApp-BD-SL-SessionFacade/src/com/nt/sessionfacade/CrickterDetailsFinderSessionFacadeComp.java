package com.nt.sessionfacade;

import com.nt.dto.CrickterInputsDTO;
import com.nt.dto.CrickterProfileDTO;
import com.nt.errors.CrickterIdFinderException;
import com.nt.errors.CrickterProfileFinderException;

public interface CrickterDetailsFinderSessionFacadeComp {
    public  CrickterProfileDTO   gatherCrickterDetails(CrickterInputsDTO ipDTO)throws CrickterIdFinderException,CrickterProfileFinderException;
}
