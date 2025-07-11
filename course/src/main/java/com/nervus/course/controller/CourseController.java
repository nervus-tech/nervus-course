package com.nervus.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/test")
    public String test() {
        return "Course Service is running";
    }
}