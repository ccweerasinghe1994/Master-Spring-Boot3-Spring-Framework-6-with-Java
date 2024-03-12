package com.wchamara.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Person
 * String name
 */
record Person(String name, int age, Address address) {
}

record Address(String firtLine, String secondLine, String city, String country, String zipCode) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Chamara11111111111";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    @Qualifier("addressQualifier")
    public Address address() {
        return new Address("No 123", "Galle Road", "Colombo", "Sri Lanka", "12345");
    }

    @Bean
    @Primary
    public Person person1() {
        return new Person("Chamara", 30, address());
    }

    @Bean("yourCustomBeanName")
    public Person person2() {
        return new Person("Chamara", 31, address());
    }

    @Bean
    public Person person3MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person4MethodCall(String name, int age, @Qualifier("addressQualifier") Address address) {
        return new Person(name, age, address);
    }

}
