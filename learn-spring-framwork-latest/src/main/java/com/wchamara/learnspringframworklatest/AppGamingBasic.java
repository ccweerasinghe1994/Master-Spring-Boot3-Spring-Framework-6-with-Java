package com.wchamara.learnspringframworklatest;

import com.wchamara.learnspringframworklatest.game.GamerRunner;
import com.wchamara.learnspringframworklatest.game.MarioGame;

public class AppGamingBasic {
   public static void main(String[] args) {
    var marioGame = new MarioGame();
    var gameRunner = new GamerRunner(marioGame);
    gameRunner.run();
   }
}
