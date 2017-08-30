package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_Table2")
public class Customer {
	@Id
	@Column(name="customer_ID")
	private int customerID;
	@Column(name="customer_First_Nmame")
	private String customerFirstName;
	@Column(name="customer_Last_Name")
	private String customerLastName;
	@Column(name="customer_Middle_Name")
	private String customerMiddleName;
	@Column(name="customer_Street")
	private String  customerStreet;
	@Column(name="customer_City")
	private String customerCity;
	@Column(name="customer_State")
	private String customer_State;
	@Column(name="customer_Zip")
	private String customerZip;
	@Column(name="customer_Phone")
	private String customerPhone;
	@Column(name="customer_Email")
	private String customerEmail;
	@Column(name="customer_Pasword")
	private String customerPassword;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerMiddleName() {
		return customerMiddleName;
	}
	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}
	public String getCustomerStreet() {
		return customerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomer_State() {
		return customer_State;
	}
	public void setCustomer_State(String customer_State) {
		this.customer_State = customer_State;
	}
	public String getCustomerZip() {
		return customerZip;
	}
	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerMiddleName=" + customerMiddleName + ", customerStreet=" + customerStreet
				+ ", customerCity=" + customerCity + ", customer_State=" + customer_State + ", customerZip="
				+ customerZip + ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail
				+ ", customerPassword=" + customerPassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerCity == null) ? 0 : customerCity.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerFirstName == null) ? 0 : customerFirstName.hashCode());
		result = prime * result + customerID;
		result = prime * result + ((customerLastName == null) ? 0 : customerLastName.hashCode());
		result = prime * result + ((customerMiddleName == null) ? 0 : customerMiddleName.hashCode());
		result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result + ((customerStreet == null) ? 0 : customerStreet.hashCode());
		result = prime * result + ((customerZip == null) ? 0 : customerZip.hashCode());
		result = prime * result + ((customer_State == null) ? 0 : customer_State.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerCity == null) {
			if (other.customerCity != null)
				return false;
		} else if (!customerCity.equals(other.customerCity))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerFirstName == null) {
			if (other.customerFirstName != null)
				return false;
		} else if (!customerFirstName.equals(other.customerFirstName))
			return false;
		if (customerID != other.customerID)
			return false;
		if (customerLastName == null) {
			if (other.customerLastName != null)
				return false;
		} else if (!customerLastName.equals(other.customerLastName))
			return false;
		if (customerMiddleName == null) {
			if (other.customerMiddleName != null)
				return false;
		} else if (!customerMiddleName.equals(other.customerMiddleName))
			return false;
		if (customerPassword == null) {
			if (other.customerPassword != null)
				return false;
		} else if (!customerPassword.equals(other.customerPassword))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		if (customerStreet == null) {
			if (other.customerStreet != null)
				return false;
		} else if (!customerStreet.equals(other.customerStreet))
			return false;
		if (customerZip == null) {
			if (other.customerZip != null)
				return false;
		} else if (!customerZip.equals(other.customerZip))
			return false;
		if (customer_State == null) {
			if (other.customer_State != null)
				return false;
		} else if (!customer_State.equals(other.customer_State))
			return false;
		return true;
	}
	
	
	
	
}
