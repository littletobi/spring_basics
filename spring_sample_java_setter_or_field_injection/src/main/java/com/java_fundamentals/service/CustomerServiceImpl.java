package com.java_fundamentals.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java_fundamentals.model.Customer;
import com.java_fundamentals.repository.CustomerRepository;

@Service("customerServiceBean")
public class CustomerServiceImpl implements CustomerService {

	@Autowired //mozna przeniesc nad settera i bedziemy uzywali setter injection
	private CustomerRepository customerRepository;

//	@Autowired //mozna przeniesc nad CustomerRepository customerRepository
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
