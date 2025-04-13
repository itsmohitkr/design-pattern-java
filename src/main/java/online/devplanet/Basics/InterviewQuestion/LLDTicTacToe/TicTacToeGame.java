package online.devplanet.Basics.InterviewQuestion.LLDTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque <Player> players;
    Board gameBoard;

    public void initializeGame(){
        players= new LinkedList<>(); // added to the game
        players.add(new Player("Player 1", new PlayingPieceX()));
        players.add(new Player("Player 2", new PlayingPieceO()));
        gameBoard= new Board(3);
    }

    public String startGame(){
        boolean noWinner= true;

        while(noWinner){
            Player currentPlayer = players.removeFirst();

            // get the freespace from the board
            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeCells= gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner=false;
                continue;
            }
            System.out.print("Player:" + currentPlayer.getName() + " Enter row,column: ");
            Scanner scanner= new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values= s.split(",");

            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);

            boolean isPieceAdded= gameBoard.addPiece(row, column, currentPlayer.getPlayingPiece());

            if(!isPieceAdded){
                System.out.println("you can't add piece to this cell, choose another one.");
                players.addFirst(currentPlayer);
                continue;
            }

            // if the piece is added successfully
            players.addLast(currentPlayer);

            boolean winner = isThereWinner(row, column, currentPlayer.getPlayingPiece().pieceType);

            if (winner){
                return currentPlayer.getName() + ": win the game";
            }

        }
        return "Tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch=true;
        boolean columnMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        for (int i = 0; i < gameBoard.size; i++) {
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch=false;
            }
            
        }
        for (int i = 0; i < gameBoard.size; i++) {
            if(gameBoard.board[i][column]==null || gameBoard.board[i][column].pieceType!=pieceType){
                columnMatch=false;
            }
        }
        for (int i = 0; i < gameBoard.size; i++) {
            if(gameBoard.board[i][i]==null || gameBoard.board[i][i].pieceType!=pieceType){
                diagonalMatch=false;
            }
        }
        for (int i = 0; i < gameBoard.size; i++) {
            if(gameBoard.board[i][gameBoard.size-i-1]==null || gameBoard.board[i][gameBoard.size-i-1].pieceType!=pieceType){
                antiDiagonalMatch=false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
