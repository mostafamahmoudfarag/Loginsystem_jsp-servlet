package com.mostafa.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {

	Connection conn=null;
	public database()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/course101","root","123456");
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	public void insert(String name,String password) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("insert into login(username,pass) values ('"+name+"','"+password+"')");
	    stmt.executeUpdate();
	
	}
	public boolean find(String name,String password) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("select * from login");
		ResultSet r=stmt.executeQuery();
		while(r.next())
		{
			
			if(r.getString(1).equals(name) && r.getString(2).equals(password))
			{
			
				return true;
			}
	
		
		}
	
	
		return false;
		
	}
}
