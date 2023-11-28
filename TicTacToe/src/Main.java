import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        QuizGame quiz = new QuizGame();
        AmalgamationGame amalgamation = new AmalgamationGame();
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
                    game.startGameTicTacToe();
                    gameEnded = true;
                    mainMenu();
                    break;
                case "2":
                    quiz.startQuizGame();
                    gameEnded=true;
                    mainMenu();
                    break;
                case "3":
                    amalgamation.startAmalgamationGame();
                    gameEnded=true;
                    mainMenu();
                    break;
                case "4":
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
                    System.out.println("Player vs Player : 3 Game Modes");
                    System.out.println("Turn-based");
                    System.out.println("TicTacToe\n 2 Symbols: Xs and Os\n You win if you get 3 symbols aligned");
                    System.out.println("Quiz Game\n Answer and the player who has the most correct answers wins!");
                    System.out.println("Amalgamation\n Play the TicTacToe, the winner plays first on the QuizGame");
                    System.out.println("The winner is also the one who has more answers!");
                    System.out.println("If its a draw play it all again! MUAHAHAHAHAHA");
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
                    break;
                case "0":
                    System.out.println("Exiting Game\n");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, input correct one\n");
                    break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("TIC-TAC-TOE && QUIZ && Amalgamation\n");
        System.out.println("1.TTT Game");
        System.out.println("2.Quiz Game");
        System.out.println("3.Amalgamation Game");
        System.out.println("4.RULES");
        System.out.println("0.EXIT");
    }
}