package com.ojas.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.ICustomerDao;
import com.ojas.model.Crediantial;
import com.ojas.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao customerDao;
	@Override
	public void saveCustomerDetails(Crediantial crediantial) {

		 customerDao.saveCustomerDetails(crediantial);
	}
	@Override
	public String isValidUserAndPassword(String userName, String password) throws SQLException {

		return customerDao.isValidUserAndPassword(userName, password);
	}

	

}
