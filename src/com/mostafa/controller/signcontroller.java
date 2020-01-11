package com.mostafa.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mostafa.Dao.database;
@WebServlet("/signcontroller")
public class signcontroller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		System.out.println(a+"  "+b);
		database d=new database();
		try {
			d.insert(a, b);
			response.sendRedirect("index.jsp");
		} catch (SQLException e) {
	
		System.out.println("error"+e.getMessage());
		}
		
		
	}

}
