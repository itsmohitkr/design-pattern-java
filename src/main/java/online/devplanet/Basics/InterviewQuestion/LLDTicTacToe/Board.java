package online.devplanet.Basics.InterviewQuestion.LLDTicTacToe;

import java.util.ArrayList;
import java.util.List;

class Pair<I extends Number, I1 extends Number> {
    int x;
    int y;

    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Board {
    int size;
    PlayingPiece [][]board;

    public Board(int size){
        this.size=size;
        board= new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column]!=null){
            return false;
        }
        board[row][column]=playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j]==null){
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType.name() + "   ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


}
