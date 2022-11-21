package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AddressException;
import com.masai.model.Address;
import com.masai.repository.AddressDAO;
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressDAO aDao;
	@Override
	public Address addAddress(Address add) throws AddressException {
		
		
		
		
		return null;
	}

}
