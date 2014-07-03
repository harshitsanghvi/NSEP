package com.tcs.nsep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CollegeRegistrationDao {
public boolean insertCollegeDetails(String CollegeName,String UniversityName,String CollegeAddress,String SPOCName,String SPOCContactNumber,String SPOCEmailId,String City,String State)
{

	Connection conn=null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:ORCL", "a61core", "a61core");
		PreparedStatement ps=conn.prepareStatement("insert into register_college values(?,?,?,?,?,?,?,?)");
		ps.setString(1,CollegeName);
		ps.setString(2,UniversityName);
		ps.setString(3,CollegeAddress);
		ps.setString(4,SPOCName);
		ps.setString(5,SPOCContactNumber);
		ps.setString(6,SPOCEmailId);
		ps.setString(7,City);
		ps.setString(8,State);
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
