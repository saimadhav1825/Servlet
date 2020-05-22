package com.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.print(k);
		
		//two types we can call servlet to another servlet
		//--->they are requestdispatcher,send redirect
		
  //1-->        -->requestdispatcher RequestDispatcher rd=req.getRequestDispatcher("square"); 
	              //rd.forward(req, res);
		          //req.setAttribute("k",k);
		
	//2-->       sendredirect are three types
		            res.sendRedirect("square?k="+k);
		        //session
		       //cookies
		      //session management
		
		         // 2.1--> HttpSession session=req.getSession();
		         //session.setAttribute("k", k);
		          //2.2--> Cookie cookie=new Cookie("k", k+" ");
		           //res.addCookie(cookie);
		           
		          // 2.3-->session maanagement 
		          // res.sendRedirect("square?k="+k);
		//PrintWriter out=res.getWriter();
		//out.print(k);
	}
	}

}
