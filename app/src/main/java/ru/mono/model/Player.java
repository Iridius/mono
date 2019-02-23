package ru.mono.model;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

class Player implements IPlayer {

    private String mName;

    Player(String name) {
        mName = name;
    }

    @Override
    public int makeTurn() {
        int MIN = 1;
        int MAX = 6;

        return ThreadLocalRandom.current().nextInt(MIN, MAX + 1) + ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
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