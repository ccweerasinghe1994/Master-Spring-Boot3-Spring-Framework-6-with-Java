package com.wchamara.learnspringframework;

import com.wchamara.learnspringframework.game.GameRunner;
import com.wchamara.learnspringframework.game.GaminConsole;
import com.wchamara.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {


    @Bean
    public GaminConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GaminConsole game) {
        return new GameRunner(game);
    }
}
