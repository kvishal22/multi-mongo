package com.kanna.mongomulti;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class InternService {

    private final MongoTemplate mongoTemplate;

    public InternService(@Qualifier(InternDBConfig.MONGO_TEMPLATE) MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void saveIntern(@Qualifier(InternDBConfig.MONGO_TEMPLATE)Interns intern) {
        mongoTemplate.save(intern);
    }
}