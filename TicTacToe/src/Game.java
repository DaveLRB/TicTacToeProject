import java.util.Scanner;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;


    public Game() {
        board = new Board();
        player1 = new Player("X");
        player2 = new Player("O");
        currentPlayer = player1;

    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private Scanner sc = new Scanner(System.in);
    public void startGame() {
            boolean gameOver = false;

            System.out.println("Welcome to Tic Tac Toe!");

            while (!gameOver) {
                board.displayBoard();
                playerTurn(currentPlayer);

                int row = getValidInput("Enter row (1-3): ") - 1;
                int col = getValidInput("Enter column (1-3): ") - 1;

                if (board.isValidMove(row, col)) {
                    board.makeMove(row, col, currentPlayer.getSymbol());

                    if (board.checkForWin(currentPlayer.getSymbol())) {
                        board.displayBoard();
                        System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                        gameOver = true;
                    } else if (board.isBoardFull()) {
                        board.displayBoard();
                        System.out.println("It's a draw!");
                        gameOver = true;
                    } else {
                        switchPlayer();
                    }
                } else {
                    System.out.println("Invalid move! Please try again.");
                }
            }

        sc.close();
    }

        private void playerTurn(Player player) {
            System.out.println("Player " + player.getSymbol() + "'s turn:");

            int row, col;
            do {
                row = getValidInput("Enter row (1-3): ") - 1;
                col = getValidInput("Enter column (1-3): ") - 1;
            } while (!player.makeMove(board, row, col));

            if (board.checkForWin(player.getSymbol())) {
                board.displayBoard();
                System.out.println("Player " + player.getSymbol() + " wins!");
            } else if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
            } else {
                switchPlayer();
                board.displayBoard();
            }
        }

    private int getValidInput(String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
            input = sc.nextInt();
            if (input < 1 || input > 3) {
                System.out.println("Invalid input. Please enter a value between 1 and 3.");
            }
        } while (input < 1 || input > 3);
        return input;
    }
}

