package com.wchamara.learnspringframework;

import com.wchamara.learnspringframework.game.GameRunner;
import com.wchamara.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicSpringBeans {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                GamingConfiguration.class);
        ) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }

}
