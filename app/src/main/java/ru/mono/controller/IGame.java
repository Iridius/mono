package ru.mono.controller;

import java.util.Collection;

import ru.mono.model.IBoard;
import ru.mono.model.IPlayer;

public interface IGame {
    void start();

    void addPlayer(IPlayer player);
    Collection<IPlayer> getPlayers();

    IBoard getBoard();
}
