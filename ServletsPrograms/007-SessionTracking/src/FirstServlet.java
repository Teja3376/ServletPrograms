import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
			String name=request.getParameter("userName");
		    out.print("Welcome  :"+name);
		    
		HttpSession mysession=request.getSession(); // Open Session
		mysession.setAttribute("uname",name);

		out.print("<a href='SecondServlet'>Visit Next Page</a>");
		out.close();

       }catch(Exception excp){
                	System.out.println(excp);
       }
	}

}
