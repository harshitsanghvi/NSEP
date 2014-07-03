package com.tcs.nsep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankRegistrationDao 
{
	public boolean insertBankDetails(int BankId, String BankName, String BranchLoc, String SPOCName, String SPOCContact)
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:ORCL", "a61core", "a61core");
			
			PreparedStatement ps=conn.prepareStatement("insert into Register_Bank values(?,?,?,?,?)");
			
			ps.setInt(1, BankId);
			ps.setString(2, BankName);
			ps.setString(3, BranchLoc);
			ps.setString(4, SPOCName);
			ps.setString(5, SPOCContact);
			ps.executeUpdate();
			return true;
		}
		catch(Exception Ex)
		{
			Ex.printStackTrace();
			return false;
		}
		
	}
}
