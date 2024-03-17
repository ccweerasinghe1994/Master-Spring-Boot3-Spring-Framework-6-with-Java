package com.wchamara.learnjpaandhibernate.course.springjpa;

import com.wchamara.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {

}
