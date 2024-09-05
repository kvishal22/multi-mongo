package com.kanna.mongomulti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interns")
public class InternController {
    @Autowired
    private InternService internService;

    @Autowired
    InternRepository internRepository;

    @PostMapping("/save")
    public ResponseEntity<String> saveIntern(@RequestBody Interns intern) {
        internService.saveIntern(intern);
        return ResponseEntity.ok("Intern data saved successfully.");
    }
}