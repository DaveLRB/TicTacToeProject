import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        QuizGame quiz = new QuizGame();
        boolean gameEnded = false;

        while (true) {
            if (gameEnded) {
                gameEnded = false;
            } else {
               mainMenu();
            }
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    game.startGameTicTacToeOnly();
                    gameEnded = true;
                    mainMenu();
                    break;
                case"2":
                    quiz.startQuizGameOnly();
                    break;
                case"3":
                    amalgamationGame();
                    break;
                case "4":
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
                    System.out.println("Player vs Player game");
                    System.out.println("3x3 board");
                    System.out.println("Turn-based");
                    System.out.println("2 Symbols: Xs and Os");
                    System.out.println("You win if you get 3 symbols aligned");
                    System.out.println("The winner must answer a question to totally win");
                    System.out.println("If he answers the question wrong the player that lost gets a chance to win it ALL");
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
                    break;
                    case "0":
                    System.out.println("Exiting Game");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, input correct one");
                    break;
            }
        }
    }
    private static void mainMenu(){
        System.out.println("TIC-TAC-TOE && QUIZ && Amalgamation\n");
        System.out.println("1.TTT Game");
        System.out.println("2.Quiz Game");
        System.out.println("3.Amalgamation Game");
        System.out.println("4.RULES");
        System.out.println("0.EXIT");
    }

    private static void amalgamationGame(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        QuizGame quizGame = new QuizGame();

        boolean ticTacToeWon = false;
        boolean quizWon = false;
        int currentQuestionIndex = 0; // Track the current question index

        while (!ticTacToeWon || !quizWon) {
            ticTacToeGame.startGameTicTacToeOnly();

            if (ticTacToeGame.isGameWon()) {
                String currentPlayer = ticTacToeGame.getCurrentPlayerSymbol();
                System.out.println("Player " + currentPlayer + " won in Tic Tac Toe! Now it's Quiz time.");

                // Retrieve the current question using the index
                String question = quizGame.getQuestion(currentQuestionIndex);
                while (!quizWon) {
                    String userAnswer = getUserAnswer(question);

                    if (quizGame.checkAnswer(question, userAnswer)) {
                        System.out.println("Correct Answer! Player " + currentPlayer + " wins the Quiz!");
                        quizWon = true;
                    } else {
                        System.out.println("Incorrect Answer! Try again.");
                    }
                }

                currentQuestionIndex++; // Move to the next question for the next round
            }
        }

        System.out.println("Both games won!");
    }

    public static String getUserAnswer(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine().toUpperCase();
    }
}