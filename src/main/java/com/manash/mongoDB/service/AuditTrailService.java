package com.manash.mongoDB.service;

import com.manash.mongoDB.model.CustomAuditTrail;

import com.manash.mongoDB.repo.AuditTrailRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditTrailService {

    @Autowired
    private AuditTrailRepo auditTrailRepo;

    public CustomAuditTrail saveOrUpdate(CustomAuditTrail cusAT){
        return auditTrailRepo.save(cusAT);
    }

    public List<CustomAuditTrail> findAll(){
        return auditTrailRepo.findAll();
    }

    public void deleteEmp(CustomAuditTrail cAT){
         auditTrailRepo.delete(cAT);
    }
}
