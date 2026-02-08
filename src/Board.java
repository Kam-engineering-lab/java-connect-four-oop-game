/**
 * Class to represent the board implementing the IBoard interface.
 */
public class Board implements IBoard {
    /**
     * The board.
     */
    private char[][] board;

    /**
     * The number of rows.
     */
    private int numRows;

    /**
     * The number of columns.
     */
    private int numColumns;

    /**
     * Initialises the board.
     *
     * @param numRows    The number of rows.
     * @param numColumns The number of columns.
     */
    public Board(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        board = new char[numRows][numColumns];
    }

    /**
     * Prints the board.
     */
    public void printBoard() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] == '\u0000') {
                    System.out.print("|   ");
                } else {
                    System.out.print("| " + board[i][j] + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7");
    }

    /**
     * Places the counter for the given player in the given position on the board.
     *
     * @param player   The player to place the counter for.
     * @param position The position to place the counter.
     * @return True if the counter was successfully placed, false otherwise.
     */
    public boolean placeCounter(Player player, int position) {
        boolean placed = false;

        for (int i = numRows - 1; i >= 0; i--) {
            if (!placed) {
                // if space is empty, place counter
                if (board[i][position - 1] == '\u0000') {
                    board[i][position - 1] = player.getColour();
                    placed = true;
                }
            }
        }

        return placed;
    }

    /**
     * Checks if the given player has won.
     *
     * @param player The player.
     * @return True if the given player has won, false otherwise.
     */
    public boolean checkWin(Player player) {
        boolean hasWon = false;
        int count = 0;

        // check horizontal
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] == player.getColour()) {
                    count = count + 1;
                    if (count >= 4) {
                        hasWon = true;
                        System.out.println("This was a horizontal win.");
                    }
                } else {
                    count = 0;
                }
            }
        }

        // check vertical
        count = 0;
        for (int i = 0; i < numColumns; i++) {
            for (int j = 0; j < numRows; j++) {
                if (board[j][i] == player.getColour()) {
                    count = count + 1;
                    if (count >= 4) {
                        hasWon = true;
                        System.out.println("This was a vertical win.");
                    }
                } else {
                    count = 0;
                }
            }
        }

        // check for descending diagonal win
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 0; j < numColumns - 3; j++) {
                if (board[i][j] == player.getColour() &&
                        board[i+1][j+1] == player.getColour() &&
                        board[i+2][j+2] == player.getColour() &&
                        board[i+3][j+3] == player.getColour()) {
                    System.out.println("This was a diagonal win.");
                    return true;
                }
            }
        }

        // check for ascending diagonal win
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 3; j < numColumns; j++) {
                if (board[i][j] == player.getColour() &&
                        board[i+1][j-1] == player.getColour() &&
                        board[i+2][j-2] == player.getColour() &&
                        board[i+3][j-3] == player.getColour()) {
                    System.out.println("This was a diagonal win.");
                    return true;
                }
            }
        }
        return hasWon;
    }
}

