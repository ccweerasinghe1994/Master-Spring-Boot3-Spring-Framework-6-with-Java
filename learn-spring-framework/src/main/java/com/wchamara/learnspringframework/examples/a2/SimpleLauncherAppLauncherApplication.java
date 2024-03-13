package com.wchamara.learnspringframework.examples.a2;

import com.wchamara.learnspringframework.service.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.wchamara.learnspringframework.service")
public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SimpleLauncherAppLauncherApplication.class);
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).getMax());
        }
    }

}
