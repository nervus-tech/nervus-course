package com.nervus.course.config;

import com.nervus.course.model.Course;
import com.nervus.course.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final CourseRepository courseRepository;

    public DataInitializer(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists to avoid duplication
        if (courseRepository.count() == 0) {
            // Seed sample courses
            Course course1 = new Course("CS101", "Introduction to Computer Science", 2L); // Instructor ID 2 (John Smith)
            Course course2 = new Course("CS201", "Advanced Programming", 2L);
            courseRepository.save(course1);
            courseRepository.save(course2);
            System.out.println("Seeded 2 courses into course service");
        } else {
            System.out.println("Courses already seeded, skipping...");
        }
    }
}