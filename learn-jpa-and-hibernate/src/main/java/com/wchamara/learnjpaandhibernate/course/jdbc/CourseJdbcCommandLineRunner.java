package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("✅ Inserting course via JDBC ✅");
        courseJdbcRepository.insert();
        courseJdbcRepository.insertOne(new Course(3, "book3", "wchamara"));

        courseJdbcRepository.deleteById(1);
        System.out.println("Course with id 1: " + courseJdbcRepository.findById(2));
    }
}
