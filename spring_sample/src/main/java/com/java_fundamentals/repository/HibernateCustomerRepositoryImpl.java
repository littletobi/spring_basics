package com.java_fundamentals.repository;

import java.util.ArrayList;
import java.util.List;
import com.java_fundamentals.model.Customer;

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
