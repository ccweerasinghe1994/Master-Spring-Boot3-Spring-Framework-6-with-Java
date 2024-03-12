package com.wchamara.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02SpringFramwork {
    public static void main(String[] args) {
//        try with resources
//        when the try block is finished, the context will be closed
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        ) {
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("person4MethodCall"));
//        this is called method reference
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
