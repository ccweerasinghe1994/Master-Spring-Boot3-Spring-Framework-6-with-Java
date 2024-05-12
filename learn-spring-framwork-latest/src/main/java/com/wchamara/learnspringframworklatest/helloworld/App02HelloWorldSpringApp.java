package com.wchamara.learnspringframworklatest.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringApp {
   public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
         System.out.println(context.getBean("name"));
         System.out.println(context.getBean("age"));
         System.out.println(context.getBean("person"));
         System.out.println(context.getBean("person2MethodCall"));
         System.out.println(context.getBean("person3Parameters"));
         System.out.println(context.getBean("person4Parameters"));
         System.out.println(context.getBean("person5ParametersQualifier"));
         System.out.println(context.getBean("address2"));
         System.out.println(context.getBean(Address.class));

         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

      } catch (BeansException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
