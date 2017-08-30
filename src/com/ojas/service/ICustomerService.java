package com.ojas.service;

import java.sql.SQLException;

import com.ojas.model.Crediantial;

public interface ICustomerService {

	public void saveCustomerDetails(Crediantial crediantial);

	 public String isValidUserAndPassword(String userName,String password) throws SQLException ;	
}
