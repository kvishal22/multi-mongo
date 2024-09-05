package com.kanna.mongomulti;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final MongoTemplate mongoTemplate;

    public EmployeeService(@Qualifier(EmployeeDbConfig.MONGO_TEMPLATE) MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void saveEmployee(@Qualifier(EmployeeDbConfig.MONGO_TEMPLATE)Employee employee) {
        mongoTemplate.save(employee);
    }
}