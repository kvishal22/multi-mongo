package com.kanna.mongomulti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interns {

    private String id;
    private String internName;
    private String role;
    private String department;
    private String stipend;

}