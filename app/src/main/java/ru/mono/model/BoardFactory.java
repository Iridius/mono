package ru.mono.model;

import java.util.ArrayList;
import java.util.Collection;

class BoardFactory {
    static IBoard create() {
        return new Board();
    }

    private static class Board implements IBoard {
        private Collection<ICell> mCells;

        Board(){
            mCells = new ArrayList<>();
        }

        @Override
        public Collection<ICell> getCells() {
            return mCells;
        }
    }
}
