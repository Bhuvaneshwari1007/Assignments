package com.assignments.Assignment5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments.Assignment5.bean.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
