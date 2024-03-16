# 06---Getting-Started-with-JPA-and-Hibernate-with-Spring-and-Spring-Boot

## 002 Step 01 - Getting Started with JPA and Hibernate - Goals

![alt text](image.png)
![alt text](image-1.png)

## 003 Step 02 - Setting up New Spring Boot Project for JPA and Hibernate

![alt text](image-2.png)

## 004 Step 03 - Launching up H2 Console and Creating Course Table in H2

```yml
spring:
  application:
    name: learn-jpa-and-hibernate
  h2:
    console:
      enabled: true
  datasource:
    url: jdbc:h2:mem:testdb
```

`schemas.sql`

```sql
create table course
(
    id     bigint,
    name   varchar(255),
    author varchar(255),
    primary key (id)
);


select * from course;
```

![alt text](image-3.png)

## 005 Step 04 - Getting Started with Spring JDBC

![alt text](image-4.png)
![alt text](image-5.png)
![alt text](image-6.png)
![alt text](image-7.png)

## 006 Step 05 - Inserting Hardcoded Data using Spring JDBC

```java
package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final String INSERT_SQL = """
    insert into course (id, name, author) VALUES(2, 'book1','wchamara');
    """;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        jdbcTemplate.update(INSERT_SQL);
    }


}
```

```java
package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅ Inserting course via JDBC ✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
        courseJdbcRepository.insert();
    }
}

```

![alt text](image-8.png)

## 007 Step 06 - Inserting and Deleting Data using Spring JDBC

```java
package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final String INSERT_SQL = """
    insert into course (id, name, author) VALUES(2, 'book1','wchamara');
    """;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        jdbcTemplate.update(INSERT_SQL);
    }

    public void insertOne(Course course){
        jdbcTemplate.update("insert into course (id, name, author) VALUES(?, ?, ?)", course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id){
        jdbcTemplate.update("delete from course where id=?", id);
    }


}

```

```java
package com.wchamara.learnjpaandhibernate.course.jdbc;

public class Course {

    private long id;
    private String name;

    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

```

```java
package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅ Inserting course via JDBC ✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
        courseJdbcRepository.insert();
        courseJdbcRepository.insertOne(new Course(3, "book3", "wchamara"));

        courseJdbcRepository.deleteById(1);
    }
}

```

![alt text](image-9.png)

## 008 Step 07 - Querying Data using Spring JDBC

## 009 Step 08 - Getting Started with JPA and EntityManager

## 010 Step 09 - Exploring the Magic of JPA

## 011 Step 10 - Getting Started with Spring Data JPA

## 012 Step 11 - Exploring features of Spring Data JPA

## 013 Step 12 - Understanding difference between Hibernate and JPA
