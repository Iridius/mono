package ru.mono.controller;

import java.util.Collection;

import ru.mono.model.IBoard;
import ru.mono.model.IPlayer;

public interface IGame {
    void start();

    Collection<IPlayer> getPlayers();
    IPlayer getPlayers(int i);

    IBoard getBoard();
}
