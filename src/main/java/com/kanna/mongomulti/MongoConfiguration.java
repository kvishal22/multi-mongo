package com.kanna.mongomulti;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfiguration {

    @Primary
    @Bean(name = "internDBProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.intern")
    public MongoProperties getInternProps() throws Exception {
        return new MongoProperties();
    }

    @Bean(name = "employeeDBProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.employee")
    public MongoProperties getemployeeProps() throws Exception {
        return new MongoProperties();
    }

    @Primary
    @Bean(name = "internMongoTemplate")
    public MongoTemplate internsMongoTemplate() throws Exception {
        return new MongoTemplate(internMongoDatabaseFactory(getInternProps()));
    }

    @Bean(name = "employeeMongoTemplate")
    public MongoTemplate employeeMongoTemplate(@Qualifier("employeeDBProperties") MongoProperties mongoProperties) {
        return new MongoTemplate(employeeMongoDatabaseFactory(mongoProperties));
    }

    @Primary
    @Bean(name = "internMongoDatabaseFactory")
    public MongoDatabaseFactory internMongoDatabaseFactory(@Qualifier("internDBProperties") MongoProperties mongoProperties) {
        return new SimpleMongoClientDatabaseFactory(mongoProperties.getUri());
    }

    @Bean(name = "employeeMongoDatabaseFactory")
    public MongoDatabaseFactory employeeMongoDatabaseFactory(@Qualifier("employeeDBProperties") MongoProperties mongoProperties) {
        return new SimpleMongoClientDatabaseFactory(mongoProperties.getUri());
    }
}