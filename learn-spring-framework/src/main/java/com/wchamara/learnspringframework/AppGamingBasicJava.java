package com.wchamara.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }

}
