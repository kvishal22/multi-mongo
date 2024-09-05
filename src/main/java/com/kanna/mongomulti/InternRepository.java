package com.kanna.mongomulti;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends MongoRepository<Interns, String> {
}