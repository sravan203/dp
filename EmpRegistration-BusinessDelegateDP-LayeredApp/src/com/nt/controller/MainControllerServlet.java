package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jConfiurations;
import com.nt.delegate.EmployeeMgmtBusinessDelegate;
import com.nt.errors.AutoEmployeeNumberGenerationException;
import com.nt.errors.EmployeeRegistrationException;
import com.nt.vo.EmployeeVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private static Logger logger=Logger.getLogger(MainControllerServlet.class);
	public  void init(){
		Log4jConfiurations.configure();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 EmployeeVO vo=null;
		 EmployeeMgmtBusinessDelegate delegate=null;
		 String resultMsg=null,errorMsg=null;
		 RequestDispatcher rd=null;
		//read form data and store into VO class obj
		vo=new EmployeeVO();
		vo.setEmpName(req.getParameter("ename"));
		vo.setEmpAddrs(req.getParameter("eaddr"));
		vo.setEmpDesg(req.getParameter("edesg"));
		vo.setEmpSalary(req.getParameter("esalary"));
		vo.setDeptNo(req.getParameter("deptNo"));
		try{
			delegate=new EmployeeMgmtBusinessDelegate();
			resultMsg=delegate.registerEmp(vo);
			req.setAttribute("resultMsg",resultMsg);
			rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req,res);
			}
		catch(EmployeeRegistrationException ere){
			req.setAttribute("errorMsg",ere.getMessage());
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
		catch(AutoEmployeeNumberGenerationException aenge){
			req.setAttribute("errorMsg",aenge.getMessage());
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
		catch(Exception e){
			req.setAttribute("errorMsg",e.getMessage());
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}
}//class
