package com.wchamara.learnspringframworklatest.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamerRunner {
    GamingConsole game;

    public GamerRunner(@Qualifier("pacManGame") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is running " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
