/**
 * Interface for the board.
 */
public interface IBoard{

    /**
     * Prints the board.
     */
    void printBoard();

    /**
     * Places the counter for the given player in the given position on the board.
     * @param player The player to place the counter for.
     * @param position The position to place the counter.
     * @return True if the counter was successfully places, false otherwise.
     */
    boolean placeCounter(Player player, int position);

    /**
     * Checks if the given player has won.
     * @param player The player.
     * @return True if the given player has won, false otherwise.
     */
    boolean checkWin(Player player);
}
