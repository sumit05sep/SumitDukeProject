package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="crediantial")
public class Crediantial {
@Id
	private String username;
	private String password;
	private String accountNumber;
	@OneToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name="customer_id_pk")
	private Customer customer;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Crediantial [username=" + username + ", password=" + password + ", accountNumber=" + accountNumber
				+ ", customer=" + customer + "]";
	}
	
	
}
