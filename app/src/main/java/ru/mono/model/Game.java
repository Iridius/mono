package ru.mono.model;

import android.util.Log;

import ru.mono.controller.IGame;

class Game implements IGame {
    @Override
    public void start() {
        Log.i("TAG1", "started...");
    }
}
