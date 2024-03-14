package com.wchamara.learnspringframework.examples.a4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ScopedClass {
}


@Configuration
@ComponentScan
public class ScopeAppLauncherApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ScopeAppLauncherApplication.class);
        ) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));
            System.out.println(context.getBean(ScopedClass.class));

        }
    }

}
