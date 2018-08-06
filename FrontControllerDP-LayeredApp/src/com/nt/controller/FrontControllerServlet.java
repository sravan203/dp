package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.command.Command;
import com.nt.command.CommandHelper;
import com.nt.commons.ResourceBundleInfo;
import com.nt.dispatcher.Dispatcher;


@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
	
       
    

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Command cmd=null;
		String  lvn=null;
		RequestDispatcher rd=null;
		try{
		//use Command helper and get Command object
		cmd=CommandHelper.getCommand(req);
		lvn=cmd.execute(req, res);
		}
		catch(Exception e){
			try{
		   Dispatcher.dispatchToView("", req, res);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}//catch
		}//catch
			//use Dispatcher
			try{
				Dispatcher.dispatchToView(lvn, req, res);
			}
			catch(Exception e){
				try{
				Dispatcher.dispatchToView("", req, res);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}//catch
			}//catch
			
		}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req,res);
	}

}
