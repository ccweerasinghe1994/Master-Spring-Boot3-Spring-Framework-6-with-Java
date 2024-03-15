# 05---Getting-Started-with-Spring-Boot

## 002 Step 01 - Getting Started with Spring Boot - Goals

![alt text](image.png)
![alt text](image-1.png)

## 003 Step 02 - Understanding the World Before Spring Boot - 10000 Feet Overview

![alt text](image-2.png)
![alt text](image-3.png)
![alt text](image-4.png)
![alt text](image-5.png)
![alt text](image-6.png)
![alt text](image-7.png)
![alt text](image-8.png)

## 004 Step 03 - Setting up New Spring Boot Project with Spring Initializr

![alt text](image-9.png)
![alt text](image-10.png)

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
 <artifactId>learn-spring-boot</artifactId>
 <version>0.0.1-SNAPSHOT</version>
 <name>learn-spring-boot</name>
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

you can create a new project using Spring Initializr at [https://start.spring.io/](https://start.spring.io/)

```shell
mvn clean install
```

```shell
mvn spring-boot:run
```

```shell
java -jar target/learn-spring-boot-0.0.1-SNAPSHOT.jar
```

![alt text](image-11.png)

## 005 Step 04 - Build a Hello World API with Spring Boot

## 006 Step 05 - Understanding the Goal of Spring Boot

## 007 Step 06 - Understanding Spring Boot Magic - Spring Boot Starter Projects

## 008 Step 07 - Understanding Spring Boot Magic - Auto Configuration

## 009 Step 08 - Build Faster with Spring Boot DevTools

## 010 Step 09 - Get Production Ready with Spring Boot - 1 - Profiles

## 011 Step 10 - Get Production Ready with Spring Boot - 2 - ConfigurationProperties

## 012 Step 11 - Get Production Ready with Spring Boot - 3 - Embedded Servers

## 013 Step 12 - Get Production Ready with Spring Boot - 4 - Actuator

## 014 Step 13 - Understanding Spring Boot vs Spring vs Spring MVC

## 015 Step 14 - Getting Started with Spring Boot - Review
