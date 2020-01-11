package com.mostafa.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mostafa.Dao.database;
@WebServlet("/logincontroll")
public class logincontroller extends HttpServlet{
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
	{
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		database d=new database();
		try {
			if(d.find(a, b)==true)
			{
			HttpSession session=request.getSession();
			session.setAttribute("name", a);
			response.sendRedirect("home.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp");
			}
		} catch (SQLException e) {
		System.out.println("error in find"+e.getMessage());
	
		}
		
	}

}
