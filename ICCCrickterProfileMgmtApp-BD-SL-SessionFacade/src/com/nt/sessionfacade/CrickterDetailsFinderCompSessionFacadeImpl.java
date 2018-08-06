package com.nt.sessionfacade;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CrickterInputsDTO;
import com.nt.dto.CrickterProfileDTO;
import com.nt.errors.CrickterIdFinderException;
import com.nt.errors.CrickterProfileFinderException;
import com.nt.extComp1.CrickterIdFinderComp;
import com.nt.extComp1.CrickterIdFinderCompImpl;
import com.nt.extComp2.CrickterProfileFinderComp;
import com.nt.extComp2.CrickterProfileFinderCompImpl;

public class CrickterDetailsFinderCompSessionFacadeImpl implements CrickterDetailsFinderSessionFacadeComp {

	@Override
	public CrickterProfileDTO gatherCrickterDetails(CrickterInputsDTO ipDTO)
			throws CrickterIdFinderException, CrickterProfileFinderException {
		 CrickterIdFinderComp comp1=null;
		 CrickterProfileFinderComp comp2=null;
		 CricketerIdDTO idDTO=null;
		 CrickterProfileDTO profileDTO=null;
		try{
		  //use Both external comps
			comp1=new CrickterIdFinderCompImpl();
			idDTO=comp1.findCrickerId(ipDTO);
			comp2=new CrickterProfileFinderCompImpl();
			profileDTO=comp2.fetchProfile(idDTO);
		}
		catch(CrickterIdFinderException cife){
			throw cife;
		}
		catch(CrickterProfileFinderException cpfe){
			throw cpfe;
		}
		return profileDTO;
	}//method
}//class
