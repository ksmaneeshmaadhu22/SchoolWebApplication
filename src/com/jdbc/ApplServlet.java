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

@WebServlet("/ApplServlet")
public class ApplServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
		//	PrintWriter out=response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "admin");
			
			String StudentName = request.getParameter("sname");    
		    String FatherName = request.getParameter("fname");
		    String MotherName = request.getParameter("mname");
		    String Gender = request.getParameter("gender");
		    String DateOfBirth = request.getParameter("dob");
		    String Address = request.getParameter("addr");
		    String AadharNumber = request.getParameter("aadhar");    
		    String Nationality = request.getParameter("nation");
		    String BloodGroup = request.getParameter("blood");
		    String MotherTongue = request.getParameter("lang");
		    
		    

		    Statement st = conn.createStatement();
		    int rs;
		    
		    String query="insert into form(StudentName, FatherName, MotherName, Gender,DateOfBirth, Address, AadharNumber, Nationality, BloodGroup, MotherTongue) "
		    		+ "values (?,?,?,?,?,?,?,?,?,?)";

//		    rs = st.executeQuery("insert into regis(StudentName, ParentName, Email, MobileNumber,Password) "
//		    		+ "values ("+StudentName+","+ParentName+","+Email+","+MobileNumber+","+Password+")");
		    PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
		   
		    ps.setString(1, StudentName);
			ps.setString(2, FatherName);
			ps.setString(3, MotherName);
			ps.setString(4, Gender);
			ps.setString(5, DateOfBirth);
			ps.setString(6, Address);
			ps.setString(7, AadharNumber);
			ps.setString(8, Nationality);
			ps.setString(9, BloodGroup);
			ps.setString(10, MotherTongue);
			ps.executeUpdate();
		    
			PrintWriter out = response.getWriter();
			//out.println("<html><body><p>You Have Successfully Registered !</p></body></html>");
			
			RequestDispatcher rd = request.getRequestDispatcher("submitted.html");
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
