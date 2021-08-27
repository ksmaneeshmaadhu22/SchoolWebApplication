package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
		//	PrintWriter out=response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "admin");
			
			String StudentName = request.getParameter("sname");    
		    String ParentName = request.getParameter("pname");
		    String Email = request.getParameter("email");
		    String MobileNumber = request.getParameter("mobile");
		    String Password = request.getParameter("pass");
		    

		    Statement st = conn.createStatement();
		    int rs;
		    
		    String query="insert into regis(StudentName, ParentName, Email, MobileNumber,Password) "
		    		+ "values (?,?,?,?,?)";

//		    rs = st.executeQuery("insert into regis(StudentName, ParentName, Email, MobileNumber,Password) "
//		    		+ "values ("+StudentName+","+ParentName+","+Email+","+MobileNumber+","+Password+")");
		    PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
		   
		    ps.setString(1, StudentName);
			ps.setString(2, ParentName);
			ps.setString(3, Email);
			ps.setString(4, MobileNumber);
			ps.setString(5, Password);
			ps.executeUpdate();
		    
			PrintWriter out = response.getWriter();
			//out.println("<html><body><p>You Have Successfully Registered !</p></body></html>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
