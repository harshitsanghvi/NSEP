package com.tcs.nsep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection 
{
	
	public Connection createDataBaseConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:ORCL", "a61core", "a61core");
			
		}
		catch(Exception Ex)
		{
			Ex.printStackTrace();
		}
		return conn;
	}
	
	public void closeDataBaseConnection(Connection conn)
	{
		try 
		{
			conn.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}

}
