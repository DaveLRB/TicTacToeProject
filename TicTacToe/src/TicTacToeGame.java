import java.util.Scanner;

public class TicTacToeGame {
    private final Board board;
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
        System.out.println("Tic Tac Toe!\n");
        boolean gameOver = false;

        while (!gameOver) {
            board.displayBoard();
            playerTurn(currentPlayer);

            int row, col;
            do {
                row = getValidInput("Enter row: ") - 1;
                col = getValidInput("Enter column: ") - 1;
            } while (!board.isValidMove(row, col));

            board.placeMove(row, col, currentPlayer.getSymbol());

            if (board.checkForWin(currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!\n");
                gameWon = true;
                winningPlayer = currentPlayer.getSymbol();
                gameOver = true;
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("It's a draw!\n");
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
        System.out.println("Player " + player.getSymbol() + "'s turn:");
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