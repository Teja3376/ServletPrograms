package com.ram;
//to show how to use request dispatcher,forward method


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class forward extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)
   throws ServletException,IOException
  {
    String s1=req.getParameter("first");
    String s2=req.getParameter("second");
   
    try
      {
	Integer.parseInt(s1);
	Integer.parseInt(s2);
      }
    catch(NumberFormatException e)
      {
	PrintWriter out=res.getWriter();
	out.println("Invalid Numbers");
       return;
	}
     RequestDispatcher rd=getServletContext().getRequestDispatcher("/addser");

    // RequestDispatcher rd=getServletContext().getRequestDispatcher("/addser");

      if(rd==null)
       {
	  PrintWriter out=res.getWriter();
         out.println("Addser not found");
	  return;
	}
     rd.forward(req,res);
     PrintWriter out=res.getWriter();
     out.println("Response Completed");
     
  }//doget

}//class 
	   	
