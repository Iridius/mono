package ru.mono.model;

class Player implements IPlayer {
    private ICell mCurrentCell;
    Player(ICell cell) {
        setCurrentCell(cell);
    }

    @Override
    public ICell getCurrentCell() {
        return mCurrentCell;
    }

    @Override
    public void setCurrentCell(ICell cell) {
        mCurrentCell = cell;
    }
}