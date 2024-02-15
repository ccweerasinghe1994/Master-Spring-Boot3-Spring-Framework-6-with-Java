package com.wchamara.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Person
 * String name
 */
record Person(String name, int age) {
}

record Address(String firtLine, String secondLine, String city, String country, String zipCode) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Chamara";
    }

    @Bean
    public String age() {
        return "30";
    }

    @Bean
    public Address address() {
        return new Address("No 123", "Galle Road", "Colombo", "Sri Lanka", "12345");
    }

    @Bean
    public Person person1() {
        return new Person("Chamara", 30);
    }

    @Bean("yourCustomBeanName")
    public Person person2() {
        return new Person("Chamara", 31);
    }

}
