package com.wchamara.learnspringframworklatest;

import com.wchamara.learnspringframworklatest.business.BusinessCalculationService;
import com.wchamara.learnspringframworklatest.game.GamerRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.wchamara.learnspringframworklatest.business")
public class BusinessCalculationApplication {
   public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class)) {
         int calculateSum = context.getBean(BusinessCalculationService.class).calculateSum();
         System.out.println("Sum: " + calculateSum);
      }
   }
}
