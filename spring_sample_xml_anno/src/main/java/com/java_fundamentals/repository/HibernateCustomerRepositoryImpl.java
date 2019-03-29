package com.java_fundamentals.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.java_fundamentals.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}") // to jest sposob na wstrzykiwanie danych przez adnotacje.
	private String databaseUsername;

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
