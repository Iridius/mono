package ru.mono.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import ru.mono.controller.IGame;

import static org.junit.Assert.*;

public class Tests {
    private IGame mGame;
    private IBoard mBoard;
    private IPlayer mPlayer1;

    @Before
    public void init(){
        mGame = new Game();

        mPlayer1 = new Player("name1");
        mGame.addPlayer(mPlayer1);

        IPlayer mPlayer2 = new Player("name2");
        mGame.addPlayer(mPlayer2);

        mGame.start();

        mBoard = mGame.getBoard();
    }

    @Test
    public void game_starts_with_2_players() {
        assertEquals("Ожидалось, что в игре будет 2 игрока.", 2, mGame.getPlayers().size());
    }

    @Test
    public void turn_ranged_from_2_to_12_points(){
        Collection<Integer> results = new TreeSet<>();

        int i = 0;
        while(i < 100) {
            results.add(mPlayer1.makeTurn());
            i++;
        }

        assertEquals("Ожидалось, что в ста бросках двух кубиков будут все 11 возможных значений: {2...12}.", 11, results.size());
        for(int j=2; j<=12; j++){
            assertTrue("Ожидалось, что при достаточно большом количестве бросков обязательно должна выпась каждая комбинация в диапазоне {2...12}. Не выпала: " + j, results.contains(j));
        }
    }

    @Test
    public void at_start_game_players_on_zero_position(){
        fail("Ожидалось, что в начале игры игроки начнут игру в нулевой позиции.");
        //assertEquals("Ожидалось, что первый игрок начнёт игру в нулевой позиции.", 0, position1);
        //assertEquals("Ожидалось, что второй игрок начнёт игру в нулевой позиции.", 0, position2);
    }

    @Test
    public void board_contains_40_cells() {
        assertEquals("Ожидалось, что игровая доска будет состоять из 40 ячеек.", 40, mBoard.getCells().size());
    }

    @Test
    public void board_have_zero_cell(){
        for(ICell cell: mBoard.getCells()){
            if(cell.getNumber() == 0){
                return;
            }
        }

        fail("Ожидалось, что игровое поле будет иметь начальную ячейку.");
    }

    @Test
    public void after_last_cell_must_be_first_cell(){
        final int DELTA = 42;
        mBoard.move(mPlayer1, DELTA);

        //assertEquals("Ожидалось, что после последней ячейки будет первая (начало и конец игровой доски замкнуты).", 2, mPlayer1.getCurrentCell().getNumber());
        fail("Ожидалось, что после последней ячейки будет первая (начало и конец игровой доски замкнуты).");
    }
}

