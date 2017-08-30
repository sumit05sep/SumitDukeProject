package com.ojas.dao;

import java.sql.SQLException;

import com.ojas.model.Crediantial;

public interface ICustomerDao  {

	public void saveCustomerDetails(Crediantial crediantial);

  public String isValidUserAndPassword(String userName,String password) throws SQLException;	
	
}
