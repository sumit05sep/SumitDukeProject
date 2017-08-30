package com.ojas.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ojas.dao.ICustomerDao;
import com.ojas.model.Crediantial;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	
	@Autowired
	private HibernateTemplate ht;
	
	@Autowired
    private DataSource dataSource;
	@Override
	public void saveCustomerDetails(Crediantial crediantial) {

		
	 ht.save(crediantial); 
	}
	@Override
	public String isValidUserAndPassword(String userName, String password) throws SQLException {
		
		
			//String query = "select count(1) from crediantial where username = ? and password = ?";
System.out.println("0");			
String q="select CUSTOMER_TABLE2.CUSTOMER_FIRST_NMAME  from CUSTOMER_TABLE2 left join  CREDIANTIAL c on CUSTOMER_TABLE2.CUSTOMER_ID = c.CUSTOMER_ID_PK where username =? and password = ?";

			String r=null;
			
			System.out.println("1");
			PreparedStatement pstmt = dataSource.getConnection().prepareStatement(q);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			ResultSet resultset = pstmt.executeQuery();
		 System.out.println(resultset);
			if(resultset.next())
			{  r=resultset.getString(1);
				System.out.println(r);
				
			//return (resultset.getInt(1) > 0);
				
				return r;
			}
			
			else
		return r;
	}

	
}
