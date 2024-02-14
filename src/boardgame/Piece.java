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

    //metodo abstrato para saber a possiveis jogadas de cada peça
    public abstract boolean[][] possibleMoves();
        
    // Retorna uma matriz boleana de possiveis jogadas
    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    
    // Verifica se existe pelo menos um movimento possivel a ser feito
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if (mat[i][j]) {
                   return true; 
                }
            }
        }
        return false;
    }

}
