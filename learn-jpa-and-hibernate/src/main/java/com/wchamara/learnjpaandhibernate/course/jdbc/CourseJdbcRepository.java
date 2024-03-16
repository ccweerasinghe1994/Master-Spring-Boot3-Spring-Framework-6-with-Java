package com.wchamara.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

    public Course findById(long id){
        return jdbcTemplate.queryForObject("select * from course where id=?", new BeanPropertyRowMapper<>(Course.class),id);
    }


}
