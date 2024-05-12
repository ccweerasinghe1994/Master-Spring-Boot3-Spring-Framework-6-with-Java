package com.wchamara.learnspringframworklatest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wchamara.learnspringframworklatest.game.GamerRunner;

public class AppGamingSpringBeans {
   public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(GaminConfiguration.class)) {
         context.getBean(GamerRunner.class).run();
      }
   }
}
