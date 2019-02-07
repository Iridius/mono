package ru.mono.model;

import ru.mono.controller.IGame;

public class GameFactory {
    public static IGame create() {
        return new Game(2);
    }
}