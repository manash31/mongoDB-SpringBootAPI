package com.manash.mongoDB.controller;


import com.manash.mongoDB.model.CustomAuditTrail;
import com.manash.mongoDB.service.AuditTrailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class AuditTrailCntrl {

    @Autowired
    private AuditTrailService empService;

    @PostMapping("/insertData")
    public ResponseEntity<CustomAuditTrail> saveOrUpdate(@RequestBody CustomAuditTrail emp){
        return new ResponseEntity<CustomAuditTrail>(empService.saveOrUpdate(emp), HttpStatus.ACCEPTED);
    }

    @GetMapping("/findAllEmp")
    public ResponseEntity<List<CustomAuditTrail>> findAll(){
        return new ResponseEntity<List<CustomAuditTrail>>(empService.findAll(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteEmp")
    public ResponseEntity<String> deleteEmp(CustomAuditTrail emp){
        empService.deleteEmp(emp);
        return new ResponseEntity<String>("Record Deleted", HttpStatus.ACCEPTED);
    }
}
