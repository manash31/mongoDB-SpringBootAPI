package com.manash.mongoDB.repo;

import com.manash.mongoDB.model.CustomAuditTrail;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditTrailRepo extends MongoRepository<CustomAuditTrail, Integer> {
}
