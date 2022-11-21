package com.masai.service;

import com.masai.exception.AddressException;
import com.masai.exception.CustomerException;
import com.masai.model.Customer;

public interface CustomerService {
	
	
	public Customer addCustomer(Customer cust) throws CustomerException,AddressException;

}
