package com.assignments7.Assignment7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments7.Assignment7.bean.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {

}