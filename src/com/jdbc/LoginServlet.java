package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "admin");
			
			String email = request.getParameter("email");    
		    String pwd = request.getParameter("pass");
		    
		    Statement st = conn.createStatement();
		    ResultSet rs;

		    rs = st.executeQuery("select * from regis where Email='" + email + "' and Password='" + pwd + "'");
		   
		    HttpSession session = request.getSession();
		if(rs.next()) {
			session.setAttribute("email",email);
			response.sendRedirect("applform.jsp");
	    } 
		else 
		{
			response.sendRedirect("invalid.html");
	       // out.println("<h1>Invalid password</h1>");
	     //   out.println("<a href='login.jsp'>try again</a>");
	    }
		
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}
	}

}
