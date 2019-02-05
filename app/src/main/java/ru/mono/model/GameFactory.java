package ru.mono.model;

import android.util.Log;

import ru.mono.controller.IGame;

public class GameFactory {
    public static IGame create() {
        Log.i("TAG1", "create");

        IGame game = new Game();

        return game;
    }
}
