package com.kanna.mongomulti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    String id;
    String employeeName;
    String department;
    String role;
    int salary;
    int experience;

}