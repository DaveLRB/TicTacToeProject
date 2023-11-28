import java.util.Scanner;

public class AmalgamationGame {
    private TicTacToeGame gameTTT;
    private QuizGame quizGame;

    public AmalgamationGame() {
        gameTTT = new TicTacToeGame();
        quizGame = new QuizGame();
    }

    public void startAmalgamationGame() {
        System.out.println("Amalgamation\n");
        boolean playAgain = false;

        while (!playAgain) {
            String winner = playTicTacToeAndGetWinner();
            playQuizGame(winner);
            playAgain = askToPlayAgain();
        }

        System.out.println("Thanks for playing Amalgamation!");
    }

    private String playTicTacToeAndGetWinner() {
        gameTTT.startGameTicTacToe();
        return gameTTT.getCurrentPlayerSymbol();
    }

    private void playQuizGame(String winner) {

        if (winner.equals("X")) {
            quizGame.startQuizGame();
        } else {
            quizGame.startQuizGame();
        }
    }

    private boolean askToPlayAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (Y/N)");
        String response = scanner.nextLine().trim().toUpperCase();

        while (!response.equals("Y") && !response.equals("N")) {
            System.out.println("Invalid input. Please enter Y or N.");
            response = scanner.nextLine().trim().toUpperCase();
            if(response.equals("N")){
                System.exit(0);
                break;
            }
        }

        return response.equals("Y");
    }
}