package com.kanna.mongomulti;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.kanna.mongomulti"},
        mongoTemplateRef = EmployeeDbConfig.MONGO_TEMPLATE
)
public class EmployeeDbConfig {
    protected static final String MONGO_TEMPLATE = "employeeMongoTemplate";
}