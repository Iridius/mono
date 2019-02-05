package ru.mono.model;

import org.junit.Test;

import ru.mono.controller.IGame;

import static org.junit.Assert.*;

public class GameFactoryTest {

    @Test
    public void create_2_players() {
        IGame game = GameFactory.create();

        assertEquals("Ожидалось, что в игре будет 2 игрока.", 2, game.getPlayers());
    }
}