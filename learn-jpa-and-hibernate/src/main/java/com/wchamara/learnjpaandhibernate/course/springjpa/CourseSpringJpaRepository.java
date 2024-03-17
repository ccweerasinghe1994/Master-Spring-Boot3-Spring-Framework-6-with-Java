package com.wchamara.learnjpaandhibernate.course.springjpa;

import com.wchamara.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
    List<com.wchamara.learnjpaandhibernate.course.Course> findByAuthor(String author);
}
