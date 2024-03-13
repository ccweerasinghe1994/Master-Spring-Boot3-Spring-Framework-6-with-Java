package com.wchamara.learnspringframework.examples.a5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private final SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init");
        someDependency.doSomething();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

}

@Component
class SomeDependency {

    public void doSomething() {
        System.out.println("Doing something");
    }
}

@Configuration
@ComponentScan
public class PreConstructPostConstructAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PreConstructPostConstructAppLauncherApplication.class);
        ) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
