package com.wchamara.learnjpaandhibernate.course.jdbc;

import com.wchamara.learnjpaandhibernate.course.Course;
import com.wchamara.learnjpaandhibernate.course.springjpa.CourseSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    //    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;
    @Autowired
    private CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1, "book1", "wchamara");
        Course course2 = new Course(2, "book2", "wchamara");
        Course course3 = new Course(3, "book3", "wchamara");
        repository.save(course);
        repository.save(course2);
        repository.save(course3);

        repository.deleteById(1L);

        System.out.println("Course with id 1: " + repository.findById(1L));
        System.out.println("Course with id 2: " + repository.findById(2L));

        System.out.println(repository.findByAuthor("wchamara"));

        //        repository.deleteById(1);
//        System.out.println("Course with id 1: " + repository.findById(2));
    }
}
