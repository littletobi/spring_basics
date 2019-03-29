package com.java_fundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_fundamentals.model.Customer;
import com.java_fundamentals.repository.CustomerRepository;

@Service("otherCustomerServiceBean")
public class OtherCustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;
	
	@Autowired
	public OtherCustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection from other customer service");
		this.customerRepository = customerRepository;
	}
		
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
