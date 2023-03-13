package com.manash.mongoDB.service;

import com.manash.mongoDB.model.Employee;
import com.manash.mongoDB.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveOrUpdate(Employee emp){
        return employeeRepo.save(emp);
    }

    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

    public void deleteEmp(Employee emp){
         employeeRepo.delete(emp);
    }
}
