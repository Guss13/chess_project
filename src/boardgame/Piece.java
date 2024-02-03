package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    /* 
    public abstract Piece[][] possibleMoves();
      
    public abstract boolean possibleMove(Position position);

    public abstract boolean isThereAnyPossibleMove();
    */
}
