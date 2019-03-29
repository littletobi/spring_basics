package com.java_fundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java_fundamentals.model.Customer;

@Repository("customerRepositoryBean")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("Tobi");
		customer.setLastName("Kenobi");

		customers.add(customer);
		return customers;
	}
}
