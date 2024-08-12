package com.example.starbucks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestClass {
    @Id
    private  Long id;
    private String name;
}
