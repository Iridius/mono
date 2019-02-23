package ru.mono.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;

import ru.mono.controller.IGame;

public class Game implements IGame {
    private Collection<IPlayer> mPlayers;
    private IBoard mBoard;

    public Game() {
        mBoard = BoardFactory.create();
        mPlayers = new ArrayList<>();
    }

    @Override
    public void start() {
        Log.i("TAG1", "started...");
    }

    @Override
    public void addPlayer(IPlayer player) {
        mPlayers.add(player);
    }

    @Override
    public Collection<IPlayer> getPlayers() {
        return mPlayers;
    }

    @Override
    public IBoard getBoard() {
        return mBoard;
    }
}
