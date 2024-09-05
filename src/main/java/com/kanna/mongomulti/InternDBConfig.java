package com.kanna.mongomulti;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.kanna.mongomulti"},
        mongoTemplateRef = InternDBConfig.MONGO_TEMPLATE
)
public class InternDBConfig {
    protected static final String MONGO_TEMPLATE = "internMongoTemplate";
}