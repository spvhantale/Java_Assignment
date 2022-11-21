package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AddressException;
import com.masai.exception.CustomerException;
import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.repository.AddressDAO;
import com.masai.repository.CustomerDAO;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO cDao;
	
	@Autowired
	private AddressDAO aDao;
	@Override
	public Customer addCustomer(Customer cust) throws CustomerException,AddressException {

		List<Address> addresses=cust.getAddresses();
		if(addresses.size()!=0) {
			for(Address ad:addresses) {
				aDao.save(ad);
			}
		}else {
			throw new AddressException("Address not present");
		}
		Customer cu=cDao.save(cust);
		if(cu!=null)
		return cu;
		

		throw new CustomerException("Customer details are wrong");
	}

}
