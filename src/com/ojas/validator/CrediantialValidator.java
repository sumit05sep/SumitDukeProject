/*package com.ojas.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ojas.service.ICustomerService;

@Component
public class CrediantialValidator {

@Autowired
ICustomerService customerService;

public String doValidatorCheck(String userName,String password)
{
	
	try
	{
		String isValidUser =customerService.isValidUserAndPassword(userName,password);
		if(isValidUser)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}

	
}
	
	

}
	

*/