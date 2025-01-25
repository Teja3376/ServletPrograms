
package com.servlet.jdbc;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class RegisterServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        String uname = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String lang = request.getParameter("language");
 
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/studenttribedb","root","root");
            
            PreparedStatement ps = con
                    .prepareStatement("insert into USERDETAILS values(?,?,?,?)");
 
            ps.setString(1, uname);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, lang);
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered..."+i);
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }
 
}
