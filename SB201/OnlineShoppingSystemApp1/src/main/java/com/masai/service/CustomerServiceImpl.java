package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AddressException;
import com.masai.exception.CustomerException;

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
	public Customer addCustomer(Customer cust) throws CustomerException {
		
		
		
		Customer cu=cDao.save(cust);
		if(cu==null) {
			throw new CustomerException("Customer is not saved");
		}else {
			return cu;
		}
	
	}

	@Override
	public Customer updateCustomer(Customer cust) throws CustomerException {
		
		Optional<Customer> opt=cDao.findById(cust.getCustomerId());
		if(opt.isPresent()) {
			Customer c=opt.get();
			c=cust;
			return c;
		}else {
			throw new CustomerException("Customer not found"+cust.getCustomerId());
		}
		
		
	}

	@Override
	public Customer removeCustomer(Customer cust) throws CustomerException {
		
		Optional<Customer> opt=cDao.findById(cust.getCustomerId());
		if(opt.isPresent()) {
			Customer c=opt.get();
			cDao.delete(c);
			return c;
		}else {
			throw new CustomerException("Customer not found"+cust.getCustomerId());
		}
	}

	@Override
	public Customer viewCustomer(Customer cust) throws CustomerException {
		Optional<Customer> opt=cDao.findById(cust.getCustomerId());
		if(opt.isPresent()) {
			Customer c=opt.get();
			return c;
		}else {
			throw new CustomerException("Customer not found"+cust.getCustomerId());
		}
	}

	@Override
	public List<Customer> viewAllCustomer(String location) throws CustomerException,AddressException {
		
//		Address opt=aDao.findByCity(location);
//		
//		if(opt==null) {
//			throw new AddressException("Address not found"+location);
//		}else {
//			
//		}
//		
		return null;
	}

	
}
