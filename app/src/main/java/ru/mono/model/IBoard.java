package ru.mono.model;

import java.util.Collection;

public interface IBoard {
    Collection<ICell> getCells();
    ICell getCell(int i);

    void move(IPlayer player, int delta);
}
