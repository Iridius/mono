package ru.mono.model;

import android.util.Log;

import ru.mono.controller.IGame;

public class GameFactory {
    private static int PLAYERS = 2;

    public static IGame create() {
        IGame game = new Game(PLAYERS);
        return game;
    }
}