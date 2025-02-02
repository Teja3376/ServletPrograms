package com.ram;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class addser extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)
 throws ServletException,IOException
 {
   String s1=req.getParameter("first");
   String s2=req.getParameter("second");
   int sum=Integer.parseInt(s1)+Integer.parseInt(s2);//bl
      
   res.setContentType("text/html");
   PrintWriter out=res.getWriter();
   out.println("Sum:"+sum);
 }//doget

}//class
