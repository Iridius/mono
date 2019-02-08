package ru.mono.model;

import org.junit.Before;
import org.junit.Test;

import ru.mono.controller.IGame;

import static org.junit.Assert.*;

public class Tests {
    private IGame mGame;
    private IBoard mBoard;
    private IPlayer mPlayer1;
    private IPlayer mPlayer2;

    @Before
    public void init(){
        mGame = GameFactory.create();
        mGame.start();

        mBoard = mGame.getBoard();
        mPlayer1 = mGame.getPlayers(0);
        mPlayer2 = mGame.getPlayers(1);
    }

    @Test
    public void create_games_2_players() {
        assertEquals("Ожидалось, что в игре будет 2 игрока.", 2, mGame.getPlayers().size());
    }

    @Test
    public void at_the_start_game_all_players_has_zero_position(){
        int position1 = mPlayer1.getCurrentCell().getNumber();
        int position2 = mPlayer2.getCurrentCell().getNumber();

        assertEquals("Ожидалось, что первый игрок начнёт игру в нулевой позиции.", 0, position1);
        assertEquals("Ожидалось, что второй игрок начнёт игру в нулевой позиции.", 0, position2);
    }

    @Test
    public void create_board_40_cells() {
        assertEquals("Ожидалось, что игровая доска будет состоять из 40 ячеек.", 40, mBoard.getCells().size());
    }

    @Test
    public void board_have_initial_cell(){
        for(ICell cell: mBoard.getCells()){
            if(cell.getNumber() == 0){
                return;
            }
        }

        fail("Ожидалось, что игровое поле будет иметь начальную ячейку.");
    }

    @Test
    public void player_position_is_a_cell_number(){
        final int DELTA = 5;
        mBoard.move(mPlayer1, DELTA);

        assertEquals("Ожидалось, что при совершении хода текущая позиция игрока изменится на указанное количество клеток.", DELTA, mPlayer1.getCurrentCell().getNumber());
    }
}