package com.wchamara.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GaminConsole {

    public void up() {
        System.out.println("Jumping");
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
