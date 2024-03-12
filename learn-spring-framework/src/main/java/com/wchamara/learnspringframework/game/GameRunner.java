package com.wchamara.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class GameRunner {

    private GaminConsole game;

    public GameRunner(GaminConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game..." + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
