# 07---Build-Java-Web-Application-with-Spring-Framework,-Spring-Boot-and-Hibernate

## 002 Step 00 - Introduction to Building Web App with Spring Boot

![alt text](image.png)
![alt text](image-1.png)
![alt text](image-2.png)
![alt text](image-3.png)
![alt text](image-4.png)
![alt text](image-5.png)

## 003 Step 01 - Creating Spring Boot Web Application with Spring Initializr

use [Spring Initializr](https://start.spring.io/)

project: `Web`,`devtools` dependencies

## 004 Step 02 - Quick overview of Spring Boot Project

```yml
spring:
  application:
    name: myfirstwebapp
```

![alt text](image-6.png)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 <modelVersion>4.0.0</modelVersion>
 <parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>3.2.3</version>
  <relativePath/> <!-- lookup parent from repository -->
 </parent>
 <groupId>com.wchamara</groupId>
 <artifactId>myfirstwebapp</artifactId>
 <version>0.0.1-SNAPSHOT</version>
 <name>myfirstwebapp</name>
 <description>Demo project for Spring Boot</description>
 <properties>
  <java.version>21</java.version>
 </properties>
 <dependencies>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-devtools</artifactId>
   <scope>runtime</scope>
   <optional>true</optional>
  </dependency>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-test</artifactId>
   <scope>test</scope>
  </dependency>
 </dependencies>

 <build>
  <plugins>
   <plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
   </plugin>
  </plugins>
 </build>

</project>
```

## 005 Step 03 - First Spring MVC Controller, @ResponseBody, @Controller

```java
package com.wchamara.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }
}
```

This code is written in Java and uses the Spring Framework, a popular framework for building web applications in Java. The code defines a controller class, SayHelloController, which is responsible for handling incoming web requests.

The @Controller annotation at the top of the class declaration is a special marker, telling Spring that this class should be treated as a controller. Controllers in Spring are components that handle HTTP requests and responses.

Inside the SayHelloController class, there's a method named sayHello(). This method is annotated with @RequestMapping("/say-hello"), which tells Spring that this method should be invoked whenever there's an HTTP request to the "/say-hello" URL path.

The @ResponseBody annotation indicates that the return value of the method should be sent straight to the HTTP response body. In other words, whatever string this method returns will be what the client (e.g., a web browser) receives.

The sayHello() method itself is quite simple: it just returns the string "Hello, World!". So, when a client sends a request to "/say-hello", they will receive a response with "Hello, World!" as the body.

In summary, this code sets up a simple web server that responds with "Hello, World!" when it receives a request at the "/say-hello" URL.

## 006 Step 04 - 01 - Enhancing Spring MVC Controller to provide HTML response

## 007 Step 04 - 02 - Exploring Step By Step Coding and Debugging Guide

## 009 Step 05 - Redirect to a JSP using Spring Boot - Controller, @ResponseBody & View

## 010 Step 06 - Exercise - Creating LoginController and login view

## 011 Step 07 - Quick Overview - How does web work - Request and Response

## 012 Step 08 - Capturing QueryParams using RequestParam and First Look at Model

## 013 Step 09 - Quick Overview - Importance of Logging with Spring Boot

## 014 Step 10 - Understanding DispatcherServlet, Model 1, Model 2 and Front Controller

## 015 Step 11 - Creating a Login Form

## 016 Step 12 - Displaying Login Credentials in a JSP using Model

## 017 Step 13 - Add hard coded validation of userid and password

## 018 Step 14 - Getting started with Todo Features - Creating Todo and TodoService

## 019 Step 15 - Creating first version of List Todos Page

## 020 Step 16 - Understanding Session vs Model vs Request - @SessionAttributes

## 021 Step 17 - Adding JSTL to Spring Boot Project and Showing Todos in a Table

## 023 Step 18 - Adding Bootstrap CSS framework to Spring Boot Project using webjars

## 024 Step 19 - Formatting JSP pages with Bootstrap CSS framework

## 025 Step 20 - Lets Add a New Todo - Create a new View

## 026 Step 21 - Enhancing TodoService to add the todo

## 027 Step 22 - Adding Validations using Spring Boot Starter Validation

## 028 Step 23 - Using Command Beans to implement New Todo Page Validations

## 029 Step 24 - Implementing Delete Todo Feature - New View

## 030 Step 25 - Implementing Update Todo - 1 - Show Update Todo Page

## 031 Step 26 - Implementing Update Todo - 1 - Save changes to Todo

## 033 Step 27 - Adding Target Date Field to Todo Page

## 035 Step 28 - Adding a Navigation Bar and Implementing JSP Fragments

## 036 Step 29 - Preparing for Spring Security

## 037 Step 30 - Setting up Spring Security with Spring Boot Starter Security

## 038 Step 31 - Configuring Spring Security with Custom User and Password Encoder

## 039 Step 32 - Refactoring and Removing Hardcoding of User Id

## 040 Step 33 - Setting up a New User for Todo Application

## 041 Step 34 - Adding Spring Boot Starter Data JPA and Getting H2 database ready

## 042 Step 35 - 01 - Configuring Spring Security to Get H2 console Working

## 043 Step 36 - Making Todo an Entity and Population Todo Data into H2

## 044 Step 37 - Creating TodoRepository & Connecting List Todos page from H2 database

## 045 Step 38 - 01 - Connecting All Todo App Features to H2 Database

## 046 Step 38 - 02 - Exploring Magic of Spring Boot Starter JPA and JpaRepository

## 047 Step 39 - OPTIONAL - Overview of Connecting Todo App to MySQL database

## 048 Step 40 - OPTIONAL - Installing Docker

## 051 Step 41 - OPTIONAL - Connecting Todo App to MySQL database
