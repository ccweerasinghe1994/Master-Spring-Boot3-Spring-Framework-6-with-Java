package com.wchamara.learnspringframworklatest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wchamara.learnspringframworklatest.game.GamerRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.wchamara.learnspringframworklatest.game")
public class GamingAppLauncherApplication {
   public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
         context.getBean(GamerRunner.class).run();
         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      }
   }
}
