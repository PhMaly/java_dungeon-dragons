package com.phil.dnd;

import com.phil.dnd.database.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initGame();
        game.playGame();
    }
}