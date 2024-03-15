package com.wchamara.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
            new Course("Spring", "Spring Framework", "Spring Framework Description"),
            new Course("Java", "Core Java", "Core Java Description"),
            new Course("JavaScript", "JavaScript", "JavaScript Description")
        );
    }
}
