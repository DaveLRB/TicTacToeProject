class Player {
    private String symbol;

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean makeMove(Board board, int row, int col) {
        return board.placeMove(row, col, symbol);
    }
}
