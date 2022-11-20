package com.assignments7.Assignment7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments7.Assignment7.bean.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {

}