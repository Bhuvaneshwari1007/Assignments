package com.assignments7.Assignment7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments7.Assignment7.bean.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

}
