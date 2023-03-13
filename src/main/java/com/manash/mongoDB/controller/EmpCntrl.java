package com.manash.mongoDB.controller;

import com.manash.mongoDB.model.Employee;
import com.manash.mongoDB.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class EmpCntrl {

    @Autowired
    private EmpService empService;

    @PostMapping("/insertData")
    public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
        return new ResponseEntity<Employee>(empService.saveOrUpdate(emp), HttpStatus.ACCEPTED);
    }

    @GetMapping("/findAllEmp")
    public ResponseEntity<List<Employee>> findAll(){
        return new ResponseEntity<List<Employee>>(empService.findAll(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteEmp")
    public ResponseEntity<String> deleteEmp(Employee emp){
        empService.deleteEmp(emp);
        return new ResponseEntity<String>("Record Deleted", HttpStatus.ACCEPTED);
    }
}
