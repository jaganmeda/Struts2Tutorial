package com.jmeda.dao;

import java.util.List;

import com.jmeda.data.Customer;

public interface RegistrationDAO {
	
	public void insert(Customer customer);
	
	public void createTable();
	
	public List<Customer> findAll();

}
