package com.wchamara.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02SpringFramwork {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person4MethodCall"));
//        this is called method reference
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
