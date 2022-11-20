package com.assignments7.Assignment7.service;

import java.util.List;

import com.assignments7.Assignment7.bean.Customer;

public interface CustomerService {
	 public List<Customer> showAllCustomer();
	   public Customer showById(int id);
	   public Customer addCustomer(Customer customer);
	   public Customer updateCustomer(Customer c);
	   public void deleteCustomer(int id);
	}
