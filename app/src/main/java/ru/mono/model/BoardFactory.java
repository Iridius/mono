package ru.mono.model;

import java.util.ArrayList;
import java.util.Collection;

class BoardFactory {
    static IBoard create() {
        return new Board();
    }

    private static class Board implements IBoard {
        private Collection<ICell> mCells;
        private static int CELL_COUNT = 40;

        Board(){
            mCells = new ArrayList<>();

            for(int i = 0; i < CELL_COUNT; i++){
                ICell cell = new Cell(i);
                mCells.add(cell);
            }
        }

        @Override
        public Collection<ICell> getCells() {
            return mCells;
        }

        @Override
        public ICell getCell(int i) {
            for(ICell cell: mCells){
                if(cell.getNumber() == i){
                    return cell;
                }
            }

            return null;
        }

        @Override
        public void move(IPlayer player, int delta) {

        }

        private class Cell implements ICell {
            private int mNumber;

            Cell(int number) {
                mNumber = number;
            }

            @Override
            public int getNumber() {
                return mNumber;
            }
        }
    }
}
