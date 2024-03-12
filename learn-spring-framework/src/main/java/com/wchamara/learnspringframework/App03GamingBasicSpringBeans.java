package com.wchamara.learnspringframework;

import com.wchamara.learnspringframework.game.GameRunner;
import com.wchamara.learnspringframework.game.GaminConsole;
import com.wchamara.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wchamara.learnspringframework.game")
public class App03GamingBasicSpringBeans {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                App03GamingBasicSpringBeans.class);
        ) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }

}
