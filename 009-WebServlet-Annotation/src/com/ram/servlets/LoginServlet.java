package com.ram.servlets;

 
	import java.io.IOException; 
	import java.io.PrintWriter; 
	import javax.servlet.ServletException; 
	import javax.servlet.annotation.WebInitParam; 
	import javax.servlet.annotation.WebServlet; 
	import javax.servlet.http.HttpServlet; 
	import javax.servlet.http.HttpServletRequest; 
	import javax.servlet.http.HttpServletResponse; 
	@WebServlet(value = "/LoginServlet") 
	public class LoginServlet extends HttpServlet {

	   private static final long serialVersionUID = 1L; 

	   protected void doPost(HttpServletRequest request, HttpServletResponse response)  
	      throws ServletException, IOException { 
	   
	      response.setContentType("text/html");   
	      PrintWriter out = response.getWriter();   
	     
	      String   username=request.getParameter("uname");
	       String     password=request.getParameter("pword");
	            
	            
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet FormParameters with Annotation</title>");  
	            out.println("</head>");
	            out.println("<body bgcolor='#DFBDEA'>");
	            out.println("<center>");
	            
	            out.println("<h3> User Name : " + username + "</h3>");
	            out.println("<h3> Password  : " + password + "</h3>");
	            out.println("</center>");
	            out.println("</body>");
	            out.println("</html>");
	      
	   }   
	}


