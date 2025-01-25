
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyServlet  extends GenericServlet{

	 public void service(ServletRequest request,ServletResponse response) 
			                                throws ServletException,IOException
	 {
		  PrintWriter out=response.getWriter();
		 System.out.println("Hello Servlet World ");
		 out.println("Hello Servlet World ");
		 
		 
		
		 
		 
	 }
	
	
	
}
