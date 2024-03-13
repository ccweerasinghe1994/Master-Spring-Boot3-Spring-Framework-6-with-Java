package com.wchamara.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GaminConsole {

    public void up() {
        System.out.println("Going up");
    }

    public void down() {
        System.out.println("Going down");
    }

    public void left() {
        System.out.println("Going left");
    }

    public void right() {
        System.out.println("Going right");
    }

}
