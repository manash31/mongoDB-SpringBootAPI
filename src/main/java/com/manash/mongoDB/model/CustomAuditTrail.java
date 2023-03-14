package com.manash.mongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomAuditTrail {
    private int startDate;
    private String currentActivityName;
    private String currentActivityOwner;
    private String currentActivitySLA;
}
