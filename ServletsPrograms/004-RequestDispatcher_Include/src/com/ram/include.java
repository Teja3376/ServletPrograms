package com.ram;
//to show how to use request dispatcher,forward method


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class include extends HttpServlet
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
    
     
      if(rd==null)
       {
	  PrintWriter out=res.getWriter();
         out.println("Addser not found");
	  return;
	}
        res.setContentType("text/html");
        
        PrintWriter out=res.getWriter();
        
        out.println("First:"+s1+"<br>");
        out.println("Second:"+s2+"<br>");
          
        rd.include(req,res);
        
        out.println("<br>Response Completed");
        out.println("</br>Hello Ram End Programe...");
        
  }//doget

}//class 
	   	
