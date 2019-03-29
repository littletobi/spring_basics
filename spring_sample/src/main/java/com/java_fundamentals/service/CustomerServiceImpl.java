package com.java_fundamentals.service;

import java.util.List;

import com.java_fundamentals.model.Customer;
import com.java_fundamentals.repository.CustomerRepository;
import com.java_fundamentals.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
