import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{
		   response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		
		   HttpSession msession=request.getSession(false);
		   
		   String name=(String)msession.getAttribute("uname");
				      out.print("Hello "+name);
		out.close();
		
        }catch(Exception excp){
                	System.out.println(excp);
        }
	}
	}
