package com.tcs.nsep.model.registration;

import java.util.Random;

import com.tcs.nsep.dao.BankRegistrationDao;

public class Bank 
{
	public boolean insertBankDetails(String BankName, String BranchLoc, String SPOCName, String SPOCContact)
	{
		Random id=new Random(System.currentTimeMillis());
		int BankId=(1 + id.nextInt(2)) * 10000 + id.nextInt(10000);
		System.out.println(BankId);
		BankRegistrationDao bdao=new BankRegistrationDao();
		boolean status=bdao.insertBankDetails(BankId, BankName,BranchLoc,SPOCName, SPOCContact);
		return status;
	}
}
