package ru.mono.model;

import android.util.Log;
import ru.mono.controller.IGame;

public class Game implements IGame {
    private int mPlayers;

    public Game(int players) {
        mPlayers = players;
    }

    @Override
    public void start() {
        Log.i("TAG1", "started...");
    }

    @Override
    public int getPlayers() {
        return mPlayers;
    }
}
