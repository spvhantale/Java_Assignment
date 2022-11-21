package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AddressException;
import com.masai.exception.CustomerException;
import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.repository.AddressDAO;
import com.masai.repository.CustomerDAO;
@Service
public class AddressServiceImpl  implements AddressService{

	@Autowired
	private AddressDAO aDao;
	
	@Autowired
	private CustomerDAO cDao;
	
	@Override
	public Address addAddress(Address add) throws AddressException {
		
		Address address=aDao.save(add);
		
		if(address==null) {
			throw new AddressException("Address is not saved");
		}
		return address;
	}

	@Override
	public Address updateAddress(Address add) throws AddressException {
		
		Optional<Address> a=aDao.findById(add.getAddressId());
		if(a.isPresent()) {
			Address address=a.get();
			address=add;
			return address;
		}else {
			throw new AddressException("Addrsss not found"+add.getAddressId());
		}
		
	}

	@Override
	public Address removeAddress(Address add) throws AddressException {
		Optional<Address> a=aDao.findById(add.getAddressId());
		if(a.isPresent()) {
			Address address=a.get();
			address=add;
			aDao.delete(address);
			return address;
		}else {
			throw new AddressException("Addrsss not found"+add.getAddressId());
		}
		
		
		
		
	}

	@Override
	public List<Address> viewAllAddress(Integer customerId) throws AddressException, CustomerException {
		
		
		Optional<Customer> co=cDao.findById(customerId);
		
		if(co==null) {
			throw new CustomerException("Customer not found"+customerId);
		}else {
			Customer c=co.get();
			List<Address> add=c.getAddresses();
			if(add.size()==0) {
				throw new AddressException("no address found"+customerId);
			}else {
				
				return add;
			}
		}
		
	
	}

	@Override
	public Address viewAddress(Address add) throws AddressException {
		Optional<Address> a=aDao.findById(add.getAddressId());
		if(a.isPresent()) {
			Address address=a.get();
			return address;
		}else {
			throw new AddressException("Addrsss not found"+add.getAddressId());
		}
	}

	

}
