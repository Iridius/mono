package ru.mono.model;

import org.junit.Before;
import org.junit.Test;

import ru.mono.controller.IGame;

import static org.junit.Assert.*;

public class Tests {
    private IGame mGame;
    private IBoard mBoard;

    @Before
    public void init(){
        mGame = GameFactory.create();
        mBoard = BoardFactory.create();
    }

    @Test
    public void create_games_2_players() {
        assertEquals("Ожидалось, что в игре будет 2 игрока.", 2, mGame.getPlayers());
    }

    @Test
    public void at_the_start_game_all_players_has_zero_position(){
        fail("Ожидалось, что в начале игры игроки будут находиться на нулевой позиции.");
    }

    @Test
    public void create_board_40_cells() {
        assertEquals("Ожидалось, что игровая доска будет состоять из 40 ячеек.", 40, mBoard.getCells().size());
    }

    @Test
    public void board_have_initial_cell(){
        fail("Ожидалось, что игровое поле будет иметь начальную ячейку.");
    }
}