package com.wchamara.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class SuperContraGame implements GaminConsole {

    public void up() {
        System.out.println("Jumping");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Fire a bullet");
    }
}
