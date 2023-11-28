import java.awt.*;
import java.util.Scanner;

public class TicTacToeGame {
    private Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final Scanner input;
    private boolean gameWon;
    private String winningPlayer;

    public TicTacToeGame() {
        board = new Board();
        player1 = new Player(Colors.GREEN_BRIGHT + "X" + Colors.RESET);
        player2 = new Player(Colors.RED_BRIGHT + "𝗢" + Colors.RESET);
        currentPlayer = player1;
        input = new Scanner(System.in);
        gameWon = false;
        winningPlayer = "";
    }

    public void startGameTicTacToe() {
        System.out.println(Colors.MAGENTA_BOLD + "\n" +
                "▀█▀ █ █▀▀   ▀█▀ ▄▀█ █▀▀   ▀█▀ █▀█ █▀▀\n" + Colors.YELLOW_BOLD_BRIGHT +
                "░█░ █ █▄▄   ░█░ █▀█ █▄▄   ░█░ █▄█ ██▄" + Colors.RESET);
        System.out.println();
        boolean gameOver = false;

        while (!gameOver) {
            board.displayBoard();
            playerTurn(currentPlayer);

            int row, col;
            do {
                row = getValidInput(Colors.WHITE_BOLD_BRIGHT + "\uD835\uDC38\uD835\uDC5B\uD835\uDC61\uD835\uDC52\uD835\uDC5F \uD835\uDC5F\uD835\uDC5C\uD835\uDC64: " + Colors.RESET) - 1;
                col = getValidInput(Colors.WHITE_BOLD_BRIGHT + "\uD835\uDC38\uD835\uDC5B\uD835\uDC61\uD835\uDC52\uD835\uDC5F \uD835\uDC50\uD835\uDC5C\uD835\uDC59\uD835\uDC62\uD835\uDC5A\uD835\uDC5B:" + Colors.RESET) - 1;
            } while (!board.isValidMove(row, col));

            board.placeMove(row, col, currentPlayer.getSymbol());

            if (board.checkForWin(currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "ℙ\uD835\uDD5D\uD835\uDD52\uD835\uDD6A\uD835\uDD56\uD835\uDD63 " + Colors.RESET + currentPlayer.getSymbol() + Colors.GREEN_BOLD_BRIGHT + " \uD835\uDD68\uD835\uDD5A\uD835\uDD5F\uD835\uDD64 " + Colors.RESET);
                gameWon = true;
                winningPlayer = currentPlayer.getSymbol();
                gameOver = true;
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println(Colors.MAGENTA_BRIGHT + "\n" +
                        "█ ▀█▀ ▀ █▀   ▄▀█   █▀▄ █▀█ ▄▀█ █░█░█ █\n" +
                        "█ ░█░ ░ ▄█   █▀█   █▄▀ █▀▄ █▀█ ▀▄▀▄▀ ▄" + Colors.RESET);
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }


        }
    }


    public String getCurrentPlayerSymbol() {
        return winningPlayer;
    }


    private void playerTurn(Player player) {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "ℙ\uD835\uDD5D\uD835\uDD52\uD835\uDD6A\uD835\uDD56\uD835\uDD63 " + player.getSymbol() + Colors.WHITE_BOLD_BRIGHT + "❜\uD835\uDD64 \uD835\uDD65\uD835\uDD66\uD835\uDD63\uD835\uDD5F:" + Colors.RESET);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private int getValidInput(String prompt) {
        int inputMade;
        do {
            System.out.print(prompt);
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
            inputMade = input.nextInt();
            if (inputMade < 1 || inputMade > 3) {
                System.out.println("Invalid input. Please enter a value between 1 and 3.");
            }
        } while (inputMade < 1 || inputMade > 3);
        return inputMade;
    }
}