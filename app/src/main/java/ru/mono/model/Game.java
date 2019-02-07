package ru.mono.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;

import ru.mono.controller.IGame;

public class Game implements IGame {
    private Collection<IPlayer> mPlayers;
    private IBoard mBoard;

    Game(int players) {
        mPlayers = PlayerFactory.create(players);
        mBoard = BoardFactory.create();
    }

    @Override
    public void start() {
        Log.i("TAG1", "started...");
    }

    @Override
    public Collection<IPlayer> getPlayers() {
        return mPlayers;
    }

    @Override
    public IPlayer getPlayers(int i) {
        return (IPlayer) ((ArrayList)mPlayers).get(i);
    }

    @Override
    public IBoard getBoard() {
        return mBoard;
    }
}
