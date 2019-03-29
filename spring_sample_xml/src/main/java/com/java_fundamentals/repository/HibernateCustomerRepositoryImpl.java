package com.java_fundamentals.repository;

import java.util.ArrayList;
import java.util.List;
import com.java_fundamentals.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String databaseUsername;

	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}

	@Override
	public List<Customer> findAll() {
		System.out.println("Taken from app.properties file: " + databaseUsername);

		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("Tobi");
		customer.setLastName("Kenobi");

		customers.add(customer);
		return customers;
	}
}
