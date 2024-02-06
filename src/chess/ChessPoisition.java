package chess;

import boardgame.Position;

public class ChessPoisition {
    
    private char column;
    private int row;

    public ChessPoisition(char column, int row){
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPoisition fromPoisition(Position position){
        return new ChessPoisition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
