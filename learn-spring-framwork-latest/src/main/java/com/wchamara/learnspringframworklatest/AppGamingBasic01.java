package com.wchamara.learnspringframworklatest;

import com.wchamara.learnspringframworklatest.game.GamerRunner;
import com.wchamara.learnspringframworklatest.game.MarioGame;
import com.wchamara.learnspringframworklatest.game.PacManGame;
import com.wchamara.learnspringframworklatest.game.SuperContraGame;

public class AppGamingBasic01 {
   public static void main(String[] args) {
      var marioGame = new MarioGame();
      var superContraGame = new SuperContraGame();
      var PacManGame = new PacManGame();
      var gameRunner = new GamerRunner(PacManGame);
      gameRunner.run();
   }
}
