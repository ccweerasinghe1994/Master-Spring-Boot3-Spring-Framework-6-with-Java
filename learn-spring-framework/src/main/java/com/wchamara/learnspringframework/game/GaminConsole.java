package com.wchamara.learnspringframework.game;

/**
 * The GaminConsole interface represents a gaming console's basic controls.
 * It provides methods to simulate the four main directions of movement in a game: up, down, left, and right.
 */
public interface GaminConsole {

    /**
     * Simulates the action of moving up in a game.
     */
    void up();

    /**
     * Simulates the action of moving down in a game.
     */
    void down();

    /**
     * Simulates the action of moving left in a game.
     */
    void left();

    /**
     * Simulates the action of moving right in a game.
     */
    void right();

}