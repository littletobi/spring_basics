package com.java_fundamentals.repository;

import java.util.List;

import com.java_fundamentals.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}