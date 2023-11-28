import java.util.Scanner;

public class AmalgamationGame {
    private TicTacToeGame gameTTT;
    private QuizGame quizGame;

    public AmalgamationGame() {
        gameTTT = new TicTacToeGame();
        quizGame = new QuizGame();
    }

    public void startAmalgamationGame() {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n" +
                "╭━━━┳━╮╭━┳━━━┳╮╱╱╭━━━┳━━━┳━╮╭━┳━━━┳━━━━┳━━┳━━━┳━╮╱╭╮\n" + Colors.MAGENTA_BOLD +
                "┃╭━╮┃┃╰╯┃┃╭━╮┃┃╱╱┃╭━╮┃╭━╮┃┃╰╯┃┃╭━╮┃╭╮╭╮┣┫┣┫╭━╮┃┃╰╮┃┃\n" + Colors.YELLOW_BOLD_BRIGHT +
                "┃┃╱┃┃╭╮╭╮┃┃╱┃┃┃╱╱┃┃╱╰┫┃╱┃┃╭╮╭╮┃┃╱┃┣╯┃┃╰╯┃┃┃┃╱┃┃╭╮╰╯┃\n" + Colors.MAGENTA_BOLD +
                "┃╰━╯┃┃┃┃┃┃╰━╯┃┃╱╭┫┃╭━┫╰━╯┃┃┃┃┃┃╰━╯┃╱┃┃╱╱┃┃┃┃╱┃┃┃╰╮┃┃\n" + Colors.YELLOW_BOLD_BRIGHT +
                "┃╭━╮┃┃┃┃┃┃╭━╮┃╰━╯┃╰┻━┃╭━╮┃┃┃┃┃┃╭━╮┃╱┃┃╱╭┫┣┫╰━╯┃┃╱┃┃┃\n" + Colors.MAGENTA_BOLD +
                "╰╯╱╰┻╯╰╯╰┻╯╱╰┻━━━┻━━━┻╯╱╰┻╯╰╯╰┻╯╱╰╯╱╰╯╱╰━━┻━━━┻╯╱╰━╯" + Colors.RESET);
        boolean playAgain = false;

        while (!playAgain) {
            String winner = playTicTacToeAndGetWinner();
            playQuizGame(winner);
            playAgain = askToPlayAgain();
        }

        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "\n" +
                "╭━━━━┳╮╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╭━╮╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╭╮\n" + Colors.MAGENTA_BOLD +
                "┃╭╮╭╮┃┃╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱┃╭╯╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭━╮┃╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱┃┃\n" + Colors.YELLOW_BOLD_BRIGHT +
                "╰╯┃┃╰┫╰━┳━━┳━╮┃┃╭┳━━╮╭╯╰┳━━┳━╮╭━━┫┃╭━━┳╮╱╭┳┳━╮╭━━╮┃┃╱┃┣╮╭┳━━┫┃╭━━┳━━┳╮╭┳━┻╮╭╋┳━━┳━╮┃┃\n" + Colors.MAGENTA_BOLD +
                "╱╱┃┃╱┃╭╮┃╭╮┃╭╮┫╰╯┫━━┫╰╮╭┫╭╮┃╭╯┃╭╮┃┃┃╭╮┃┃╱┃┣┫╭╮┫╭╮┃┃╰━╯┃╰╯┃╭╮┃┃┃╭╮┃╭╮┃╰╯┃╭╮┃┃┣┫╭╮┃╭╮╋╯\n" + Colors.YELLOW_BOLD_BRIGHT +
                "╱╱┃┃╱┃┃┃┃╭╮┃┃┃┃╭╮╋━━┃╱┃┃┃╰╯┃┃╱┃╰╯┃╰┫╭╮┃╰━╯┃┃┃┃┃╰╯┃┃╭━╮┃┃┃┃╭╮┃╰┫╰╯┃╭╮┃┃┃┃╭╮┃╰┫┃╰╯┃┃┃┣╮\n" + Colors.MAGENTA_BOLD +
                "╱╱╰╯╱╰╯╰┻╯╰┻╯╰┻╯╰┻━━╯╱╰╯╰━━┻╯╱┃╭━┻━┻╯╰┻━╮╭┻┻╯╰┻━╮┃╰╯╱╰┻┻┻┻╯╰┻━┻━╮┣╯╰┻┻┻┻╯╰┻━┻┻━━┻╯╰┻╯\n" + Colors.YELLOW_BOLD_BRIGHT +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱╭━╯┃╱╱╱╱╭━╯┃╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃\n" + Colors.MAGENTA_BOLD +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯╱╱╱╱╱╱╰━━╯╱╱╱╱╰━━╯╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯\n\n\n\n\n" + Colors.RESET);
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
        System.out.println(Colors.WHITE_BRIGHT + "\uD835\uDD3B\uD835\uDD60 \uD835\uDD6A\uD835\uDD60\uD835\uDD66 \uD835\uDD68\uD835\uDD52\uD835\uDD5F\uD835\uDD65 \uD835\uDD65\uD835\uDD60 \uD835\uDD61\uD835\uDD5D\uD835\uDD52\uD835\uDD6A \uD835\uDD52\uD835\uDD58\uD835\uDD52\uD835\uDD5A\uD835\uDD5F❔ (\uD835\uDD50/ℕ)" + Colors.RESET);
        String response = scanner.nextLine().trim().toUpperCase();

        while (!response.equals("Y") && !response.equals("N")) {
            System.out.println(Colors.RED_BOLD_BRIGHT + "\uD835\uDC3C\uD835\uDC5B\uD835\uDC63\uD835\uDC4E\uD835\uDC59\uD835\uDC56\uD835\uDC51 \uD835\uDC56\uD835\uDC5B\uD835\uDC5D\uD835\uDC62\uD835\uDC61. \uD835\uDC43\uD835\uDC59\uD835\uDC52\uD835\uDC4E\uD835\uDC60\uD835\uDC52 \uD835\uDC52\uD835\uDC5B\uD835\uDC61\uD835\uDC52\uD835\uDC5F \uD835\uDC4C \uD835\uDC5C\uD835\uDC5F \uD835\uDC41" + Colors.RESET);
            response = scanner.nextLine().trim().toUpperCase();
        }

        if (response.equals("N")) {
            System.out.println(Colors.MAGENTA_BOLD + "\n" +
                    "╭━━━╮╱╱╱╭╮╱╱╱╱╱╱╱╱╭━━━╮\n" + Colors.YELLOW_BOLD_BRIGHT +
                    "┃╭━━╯╱╱╭╯╰╮╱╱╱╱╱╱╱┃╭━╮┃\n" + Colors.MAGENTA_BOLD +
                    "┃╰━━┳╮╭╋╮╭╋┳━╮╭━━╮┃┃╱╰╋━━┳╮╭┳━━╮\n" + Colors.YELLOW_BOLD_BRIGHT +
                    "┃╭━━┻╋╋╋┫┃┣┫╭╮┫╭╮┃┃┃╭━┫╭╮┃╰╯┃┃━┫\n" + Colors.MAGENTA_BOLD +
                    "┃╰━━┳╋╋┫┃╰┫┃┃┃┃╰╯┃┃╰┻━┃╭╮┃┃┃┃┃━┫\n" + Colors.YELLOW_BOLD_BRIGHT +
                    "╰━━━┻╯╰┻┻━┻┻╯╰┻━╮┃╰━━━┻╯╰┻┻┻┻━━╯\n" + Colors.MAGENTA_BOLD +
                    "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃\n" + Colors.YELLOW_BOLD_BRIGHT +
                    "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯\n" + Colors.RESET);
            System.exit(0);
        }
        gameTTT.setBoard(new Board());
        return response.equals("Y");
    }
}