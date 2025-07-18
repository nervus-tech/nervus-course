package com.nervus.course.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private Long instructor_id;

    // Getters, setters, constructors
    public Course() {}
    public Course(String code, String name, Long instructor_id) {
        this.code = code;
        this.name = name;
        this.instructor_id = instructor_id;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getInstructor_id() { return instructor_id; }
    public void setInstructor_id(Long instructor_id) { this.instructor_id = instructor_id; }
}

