package com.tcs.nsep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao 
{
	public String[] checkLogin()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:ORCL", "a61core", "a61core");
			
			Statement st= conn.createStatement();
			
			ResultSet rs=st.executeQuery("Select userName, password from Login_Details");
			
			String array[]= new String[50];
			
			while(rs.next())
			{
				// We have to create a for loop here for fetching multiple values
				array[0]=rs.getString(1);
				array[1]=rs.getString(2);
			}
			
			return array;
		}
		catch(Exception Ex)
		{
			Ex.printStackTrace();
			return null;
		}
	}
}
