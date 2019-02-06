package ru.mono.model;

import android.util.Log;
import ru.mono.controller.IGame;

public class Game implements IGame {
    private int mPlayers;
    private IBoard mBoard;

    public Game(int players) {
        mPlayers = players;
        mBoard = BoardFactory.create();
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
