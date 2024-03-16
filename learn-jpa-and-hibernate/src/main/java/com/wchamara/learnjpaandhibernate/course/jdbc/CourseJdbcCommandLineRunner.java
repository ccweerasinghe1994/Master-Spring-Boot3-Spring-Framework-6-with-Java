package com.wchamara.learnjpaandhibernate.course.jdbc;

import com.wchamara.learnjpaandhibernate.course.jdbc.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        repository.insert();
        repository.insertOne(new Course(3, "book3", "wchamara"));
//
//        repository.deleteById(1);
//        System.out.println("Course with id 1: " + repository.findById(2));
    }
}
