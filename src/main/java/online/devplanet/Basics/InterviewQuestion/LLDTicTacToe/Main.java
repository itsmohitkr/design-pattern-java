package online.devplanet.Basics.InterviewQuestion.LLDTicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Game started");
        System.out.println( game.startGame());

    }
}
