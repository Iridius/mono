package ru.mono.model;

import java.util.ArrayList;
import java.util.Collection;

class PlayerFactory {
    static Collection<IPlayer> create(final int count) {
        ArrayList<IPlayer> result = new ArrayList<>();

        int i = 0;
        while (i < count){
            IPlayer player = new Player("player" + i);
            result.add(player);

            i = i + 1;
        }

        return result;
    }
}
