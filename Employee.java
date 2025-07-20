package com.servletdbex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submit_registration")
public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("empId");
		String fname=req.getParameter("fullName");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String dep=req.getParameter("department");
		String position=req.getParameter("position");
		String doj=req.getParameter("doj");
		String address=req.getParameter("address");
		String sal=req.getParameter("salary");
		String pass=req.getParameter("password");
		
		int eid=Integer.parseInt(id);
		int mob=Integer.parseInt(phone);
		int salary=Integer.parseInt(sal);
		
		System.out.println(eid);
		System.out.println(fname);
		System.out.println(email);
		System.out.println(mob);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(dep);
		System.out.println(position);
		System.out.println(doj);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(pass);
		
		
		PrintWriter out=resp.getWriter();
		out.println(eid);
		out.println(fname);
		out.println(email);
		out.println(mob);
		out.println(dob);
		out.println(gender);
		out.println(dep);
		out.println(position);
		out.println(doj);
		out.println(address);
		out.println(salary);
		out.println(pass);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
			
			String q="Insert into employee(eid, fname, email, phoneNo, dob, gender, department, position, dateofjoin, address, salary, password) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.setInt(1, eid);
			stmt.setString(2, fname);
			stmt.setString(3, email);
			stmt.setInt(4, mob);
			stmt.setString(5, dob);
			stmt.setString(6, gender);
			stmt.setString(7, dep);
			stmt.setString(8, position);
			stmt.setString(9, doj);
			stmt.setString(10, address);
			stmt.setInt(11, salary);
			stmt.setString(12, pass);
			
			stmt.executeUpdate();
			
			con.close();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
