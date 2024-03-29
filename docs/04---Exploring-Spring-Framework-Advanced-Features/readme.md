# 04 - Exploring Spring Framework Advanced Features

## 002 Step 01 - Exploring Lazy and Eager Initialization of Spring Framework Beans

let's create two classes `ClassA` and `ClassB` and `ClassB` will have a dependency on `ClassA` and we will see how we can control the initialization of these beans.

```java
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
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//            ClassB classB = context.getBean(ClassB.class);
//            classB.doSomething();
        }
    }

}

```

let's run the application and see the output.

```shell
examples.a3.LazyAppLauncherApplication
ClassB constructor

Process finished with exit code 0
```

as you can see ClassB is not used it has been initialized by spring.

the default behavior of spring is to initialize all the beans eagerly. but we can change this behavior by using `@Lazy` annotation.

```java
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
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//            ClassB classB = context.getBean(ClassB.class);
//            classB.doSomething();
        }
    }

}

```

```shell

Process finished with exit code 0
```

now we can see the initialization of `ClassB` is not happening.

let's use `ClassB` and see

```java
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                LazyAppLauncherApplication.class);
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            ClassB classB = context.getBean(ClassB.class);
            classB.doSomething();
        }
    }
```

```shell
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.event.internalEventListenerProcessor
org.springframework.context.event.internalEventListenerFactory
lazyAppLauncherApplication
classA
classB
ClassB constructor
ClassB doSomething
```

as you can see `ClassB` is initialized when we use it.

![alt text](image.png)

## 003 Step 02 - Comparing Lazy Initialization vs Eager Initialization

![alt text](image-1.png)

## 004 Step 03 - Exploring Java Spring Framework Bean Scopes - Prototype and Singleton

```java
package com.wchamara.learnspringframework.examples.a4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ScopedClass {
}


@Configuration
@ComponentScan
public class ScopeAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ScopeAppLauncherApplication.class);
        ) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));

        }
    }

}

```

```shell
com.wchamara.learnspringframework.examples.a4.NormalClass@581ac8a8
com.wchamara.learnspringframework.examples.a4.NormalClass@581ac8a8
com.wchamara.learnspringframework.examples.a4.NormalClass@581ac8a8
com.wchamara.learnspringframework.examples.a4.NormalClass@581ac8a8
com.wchamara.learnspringframework.examples.a4.ScopedClass@6d4e5011
com.wchamara.learnspringframework.examples.a4.ScopedClass@57d7f8ca
com.wchamara.learnspringframework.examples.a4.ScopedClass@76c3e77a
com.wchamara.learnspringframework.examples.a4.ScopedClass@78123e82
com.wchamara.learnspringframework.examples.a4.ScopedClass@67c33749
```

![alt text](image-2.png)

## 005 Step 04 - Comparing Prototype vs Singleton - Spring Framework Bean Scopes

![alt text](image-3.png)

## 006 Step 05 - Exploring Spring Beans - PostConstruct and PreDestroy

```java
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

```

```shell
All Dependencies are ready
Init
Doing something
Destroy

Process finished with exit code 0
```

## 007 Step 06 - Evolution of Jakarta EE - Comparing with J2EE and Java EE

![alt text](image-4.png)
![alt text](image-5.png)

## 008 Step 07 - Exploring Jakarta CDI with Spring Framework and Java

![alt text](image-20.png)

```xml
<dependency>
    <groupId>jakarta.inject</groupId>
    <artifactId>jakarta.inject-api</artifactId>
    <version>2.0.1</version>
</dependency>
```

```java
package com.wchamara.learnspringframework.examples.a6;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Named
class BusinessService {
    private DataService dataService;

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

@Named
class DataService {
}

@Configuration
@ComponentScan
public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SimpleLauncherAppLauncherApplication.class);
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}

```

```shell
Setter Injection
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.event.internalEventListenerProcessor
org.springframework.context.event.internalEventListenerFactory
simpleLauncherAppLauncherApplication
businessService
dataService
```

## 010 Step 08 - Exploring Java Spring XML Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
    <bean id="myBean" class="java.lang.String">
        <constructor-arg value="Hello, World!"/>
    </bean>
</beans>
```

```java
package com.wchamara.learnspringframework.examples.a7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        ) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("myBean"));
        }
    }

}

```

## 011 Step 09 - Explore Java Annotations vs XML Configuration - Java Spring Framework

![alt text](image-15.png)

## 012 Step 10 - Exploring Spring Framework Stereotype Annotations - Component and more

![alt text](image-17.png)
![alt text](image-16.png)
![alt text](image-19.png)
![alt text](image-18.png)

## 013 Step 11 - Quick Review - Important Spring Framework Annotations

![alt text](image-6.png)
![alt text](image-7.png)
![alt text](image-8.png)

## 014 Step 12 - Quick Review - Important Spring Framework Concepts

![alt text](image-10.png)

## 015 Step 13 - Exploring Spring Big Picture - Framework, Modules and Projects

![alt text](image-11.png)
![alt text](image-12.png)
![alt text](image-13.png)
![alt text](image-14.png)
