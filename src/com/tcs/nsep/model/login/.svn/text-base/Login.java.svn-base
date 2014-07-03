package com.tcs.nsep.model.login;

import com.tcs.nsep.dao.LoginDao;

public class Login 
{
	public boolean checkLogin(String userName, String password)
	{
		LoginDao ldao=new LoginDao();
		String array[]= new String[50];
		array=ldao.checkLogin();
		
		if(array[0].equals(userName) && array[1].equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
