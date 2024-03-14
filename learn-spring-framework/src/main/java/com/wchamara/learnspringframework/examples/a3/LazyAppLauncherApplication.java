package com.wchamara.learnspringframework.examples.a3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {

    private final ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("ClassB constructor");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("ClassB doSomething");
    }
}


@Configuration
@ComponentScan
public class LazyAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                LazyAppLauncherApplication.class);
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            ClassB classB = context.getBean(ClassB.class);
            classB.doSomething();
        }
    }

}
