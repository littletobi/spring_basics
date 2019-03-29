package com.java_fundamentals.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java_fundamentals.model.Customer;
import com.java_fundamentals.repository.CustomerRepository;

@Service("customerServiceBean")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	// konstruktor z parametrem jest wymagany jak uzywamy constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}

////	@Autowired //mozna przeniesc nad CustomerRepository customerRepository
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("We are using setter injection");
//		this.customerRepository = customerRepository;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
