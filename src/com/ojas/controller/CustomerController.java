package com.ojas.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.model.Crediantial;
import com.ojas.model.Customer;
import com.ojas.service.ICustomerService;
import com.ojas.util.AccountNumberGenerated;
import com.ojas.util.MailUtil;
import com.ojas.util.UniquePassword;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private MailUtil mailUtil;
/*	@Autowired
	private CrediantialValidator crediantialValidator;*/

	@RequestMapping("/reg")
	public String authenticationPage() {

		return "CustomerLoginPage";
	}

	/*
	 * public String loginAuthentication(){
	 * 
	 * 
	 * 
	 * return "home"; }
	 */

	@RequestMapping("/acList")
	public String AccountList() {

		return "AcountInfo";
	}

	@RequestMapping("/newCustomer")
	public String newRegistration() {

		return "customerFrom";
	}

	@RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
	public String customerDetailsSaveInDataBase(@ModelAttribute("customer") Customer customer,
			@ModelAttribute("crediantial") Crediantial crediantial, ModelMap map) {

		String accountNumber = AccountNumberGenerated.acccountNumGenerator();
		String pwd = UniquePassword.generateUniquePwd();
		String username = customer.getCustomerFirstName() + customer.getCustomerID();


		crediantial.setUsername(username);
		crediantial.setPassword(pwd);
		crediantial.setAccountNumber(accountNumber);
		crediantial.setCustomer(customer);

		customerService.saveCustomerDetails(crediantial);

		String msg = "\t\t\tWelcome To Duke's Bank\n" + "your Account is created successfully\n" + "your Account no-"
				+ accountNumber + "\nUserName-" + username + "\npassword-" + pwd;

		mailUtil.sendEmail(customer.getCustomerEmail(), "Account Information for Duke's Bank", msg);
		System.out.println("1");

		return "success";
	}
//Login Authentication 
	@RequestMapping(value="/authentication", method=RequestMethod.POST)
	public String loginAuthentication(@RequestParam("username") String userName, @RequestParam("password") String password,
			ModelMap map) throws SQLException {

		//Boolean result = crediantialValidator.doValidatorCheck(userName, password);
		
		String r=customerService.isValidUserAndPassword(userName, password);

		if (r!=null) {
System.out.println("1..."+r);
			       //  map.addAttribute("user",)

map.addAttribute("msg",r);
			return "home";
		} else

			map.addAttribute("error", "Invalid credentials!!");
		return "CustomerLoginPage";
	}
	
	//logout 
	@RequestMapping("/logout")
	public String logout(){
		
		return "redirect:reg";
	}

}
