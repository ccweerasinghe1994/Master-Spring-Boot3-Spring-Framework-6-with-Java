package com.wchamara.learnspringframworklatest.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}

record Address(String addressLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Hello World";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Hello World", 25, new Address("123 Main St inline", "Springfield inline"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5ParametersQualifier(String name, int age, @Qualifier("address2qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    @Qualifier("address2qualifier")
    public Address address() {
        return new Address("123 Main St", "Springfield");
    }

    @Bean
    public Address address3() {
        return new Address("152 Main St", "Springfield");
    }
}
