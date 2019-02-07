package ru.mono.model;

class Player implements IPlayer {
    private int mPosition;
    private String mName;

    Player(String name) {
        mName = name;
        mPosition = 0;
    }

    @Override
    public int getPosition() {
        return mPosition;
    }
}
