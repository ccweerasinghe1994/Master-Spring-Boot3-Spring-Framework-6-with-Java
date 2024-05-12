package com.wchamara.learnspringframworklatest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wchamara.learnspringframworklatest.game.GamerRunner;
import com.wchamara.learnspringframworklatest.game.GamingConsole;
import com.wchamara.learnspringframworklatest.game.MarioGame;

@Configuration
public class GaminConfiguration {
    
    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }
    
    @Bean
    public GamerRunner gameRunner() {
        return new GamerRunner(marioGame());
    }
    // var superContraGame = new SuperContraGame();
    // var PacManGame = new PacManGame();
    // var gameRunner = new GamerRunner(PacManGame);
    // gameRunner.run();
}
