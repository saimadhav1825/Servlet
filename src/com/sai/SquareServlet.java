package com.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void Service(HttpServletResponse res,HttpServletRequest req) throws IOException
	{
		           // int c=(int)req.getAttribute("k");
		            //int d=c*c;
		            //PrintWriter out=res.getWriter();
		            //out.print(d);
		//HttpSession session=req.getSession();
		//int k=(int)session.getAttribute("k");
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies)
		{
			if(c.getName().equals(c.getValue()))
			{
				
			}
		//	 k1=k*k;
		}
		
		
	}

}
