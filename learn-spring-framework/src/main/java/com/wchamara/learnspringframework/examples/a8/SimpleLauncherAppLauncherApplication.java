package com.wchamara.learnspringframework.examples.a8;


import java.util.List;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printNamesStartWithSpringFunctional(courses);
//        printNamesLengthGreaterThanFourFunctional(courses);
    }

    private static void printNamesLengthGreaterThanFourFunctional(List<String> courses) {
        courses.stream().filter(course -> course.length() > 4).forEach(System.out::println);
    }

    private static void printNamesStartWithSpringFunctional(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

}
