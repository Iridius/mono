package ru.mono.model;

import java.util.Collection;

public interface IPlayer {
    int makeTurn();
    IAction makeChoice(Collection<IAction> actions);
}
