
public class Board {
    private String[][] board;
    private static final int SIZE = 3;

    public Board() {
        board = new String[SIZE][SIZE];
        initializeBoard();

    }

    public void initializeBoard(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void displayBoard() {
        System.out.println("    1   2   3");
        System.out.println("  -------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("  -------------");
        }
    }


    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == " ";
    }

    public boolean checkForWin(String symbol) {

        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public void makeMove(int row, int col, String symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
        }
    }


    public boolean placeMove(int row, int col, String symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }


    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

}
