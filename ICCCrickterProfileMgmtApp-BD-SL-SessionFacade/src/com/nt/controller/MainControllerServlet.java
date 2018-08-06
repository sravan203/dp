package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.businessDelegate.EspnCrickterProfileMgmtBusinessDelegate;
import com.nt.errors.EspnCrickterProfileFinderProblemException;
import com.nt.vo.CrickterInputsVO;
import com.nt.vo.CrickterProfileVO;


@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nickname=null,country=null;
		CrickterInputsVO ipVO=null;
		EspnCrickterProfileMgmtBusinessDelegate delegate;
		CrickterProfileVO profileVO=null;
		RequestDispatcher rd=null;
		//read form data
		nickname=req.getParameter("nickname");
		country=req.getParameter("country");
		//prepare CrickterInputsVO class object
		ipVO=new CrickterInputsVO();
		ipVO.setNickName(nickname);
		ipVO.setCountry(country);
		//create BusinessDelegate object
		delegate=new EspnCrickterProfileMgmtBusinessDelegate();
		try{
			//invoke b.method
			profileVO=delegate.findCrickterInfo(ipVO);
			req.setAttribute("profileVO", profileVO);
			rd=req.getRequestDispatcher("/show_crickter_details.jsp");
			rd.forward(req, res);
		}
		catch(EspnCrickterProfileFinderProblemException ecpfpe){
			req.setAttribute("errorMsg",ecpfpe.getMessage());
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           doGet(req, res);
	}//doPost(-,-)

}//class
