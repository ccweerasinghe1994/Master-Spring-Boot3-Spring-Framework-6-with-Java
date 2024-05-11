package com.wchamara.learnspringframworklatest.game;

public class GamerRunner {
    MarioGame marioGame;

    public GamerRunner(MarioGame marioGame){
        this.marioGame = marioGame;
    }

    public void run(){
        System.out.println("Mrio Game is Running");
    }

}
