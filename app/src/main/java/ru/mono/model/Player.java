package ru.mono.model;

import java.util.Collection;

class Player implements IPlayer {
    private String mName;

    Player(String name) {
        mName = name;
    }

    @Override
    public int makeTurn() {
        return 0;
    }

    @Override
    public IAction makeChoice(Collection<IAction> actions) {
        return null;
    }

    @Override
    public String toString() {
        return mName;
    }
}