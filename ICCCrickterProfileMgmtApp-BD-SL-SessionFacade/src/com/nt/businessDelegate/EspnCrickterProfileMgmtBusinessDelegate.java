package com.nt.businessDelegate;

import com.nt.dto.CrickterInputsDTO;
import com.nt.dto.CrickterProfileDTO;
import com.nt.errors.CrickterIdFinderException;
import com.nt.errors.CrickterProfileFinderException;
import com.nt.errors.EspnCrickterProfileFinderProblemException;
import com.nt.locator.CrickterDetailsFinderSessionFacadeCompServiceLoator;
import com.nt.sessionfacade.CrickterDetailsFinderSessionFacadeComp;
import com.nt.vo.CrickterInputsVO;
import com.nt.vo.CrickterProfileVO;

public class EspnCrickterProfileMgmtBusinessDelegate {
	
	public  CrickterProfileVO   findCrickterInfo(CrickterInputsVO ipVO)throws EspnCrickterProfileFinderProblemException{
		CrickterDetailsFinderSessionFacadeCompServiceLoator locator=null;
		CrickterDetailsFinderSessionFacadeComp facadeComp=null;
		CrickterInputsDTO ipDTO=null;
		CrickterProfileDTO profileDTO=null;
		CrickterProfileVO profileVO=null;
		try{
			//get SErviceLocator object
			locator=CrickterDetailsFinderSessionFacadeCompServiceLoator.getInstance();
			//invoke method to SessionFacade comp ref
			facadeComp=locator.getSessionFacadeComp("crickterJndi");
			//convert InputsVO to InputsDTO
			  ipDTO=new CrickterInputsDTO();
			  ipDTO.setNickName(ipVO.getNickName());
			  ipDTO.setCountry(ipVO.getCountry());
			//invoke method on facadeComp
			  profileDTO=facadeComp.gatherCrickterDetails(ipDTO);
			  //convert profileDTO to profileVO
			  profileVO=new CrickterProfileVO();
			  profileVO.setId(String.valueOf(profileDTO.getId()));
			  profileVO.setNickName(profileDTO.getNickName());
			  profileVO.setFullName(profileDTO.getFullName());
			  profileVO.setCountry(profileDTO.getCountry());
			  profileVO.setType(profileDTO.getType());
			  profileVO.setTotalMaches(String.valueOf(profileDTO.getTotalMaches()));
			  profileVO.setTotalInnings(String.valueOf(profileDTO.getTotalInnings()));
			  profileVO.setTotalCatches(String.valueOf(profileDTO.getTotalCatches()));
			  profileVO.setTotalRuns(String.valueOf(profileDTO.getTotalRuns()));
			  profileVO.setBattingAvg(String.valueOf(profileDTO.getBattingAvg()));
			  profileVO.setBowlingAvg(String.valueOf(profileDTO.getBowlingAvg()));
			  if(profileDTO.getTotalStumpings()==0)
				  profileVO.setTotalStumpings("NA");
			  else
				  profileVO.setTotalStumpings(String.valueOf(profileDTO.getTotalStumpings()));
			  if(profileDTO.getTotalWickets()==0)
				  profileVO.setTotalWickets("NA");
			  else
				  profileVO.setTotalWickets(String.valueOf(profileDTO.getTotalWickets()));
		}//try
		catch(CrickterIdFinderException cife){
			throw new EspnCrickterProfileFinderProblemException(cife.getMessage());
		}
		catch(CrickterProfileFinderException cpfe){
			throw new EspnCrickterProfileFinderProblemException(cpfe.getMessage());
		}
		return profileVO;
	}//method
}//class
