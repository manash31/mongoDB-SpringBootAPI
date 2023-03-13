package com.manash.mongoDB.repo;

import com.manash.mongoDB.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
}
