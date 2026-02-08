/**
 * Class for the game logic.
 */
public class GameLogic {

    /**
     * The board.
     */
    private Board board;

    /**
     * Player 1.
     */
    private Player player1;

    /**
     * Player 2.
     */
    private Player player2;

    /**
     * Initialises GameLogic.
     */
    public GameLogic(){
        board = new Board(6, 7);
        player1 = new HumanPlayer("Player 1", 'r');
        player2 = new ComputerPlayer("Player 2 (Bot)", 'y');
        playGame();
    }

    /**
     * The game play logic.
     */
    private void playGame(){

        displayInstructions();

        board.printBoard();
        boolean win = false;
        boolean isPlayer1Turn = true;
        Player currentPlayer = null;

        while(!win){
            // get the current player
            currentPlayer = isPlayer1Turn ? player1 : player2;
            System.out.println("It is " + currentPlayer.getName() + "'s turn");

            /// get players move and place counter
            boolean placed = false;
            while(!placed) {
                var position = currentPlayer.getMove();
                placed = board.placeCounter(currentPlayer, position);
                // if unable to place counter, ask player to retry
                if (!placed) {
                    System.out.println("Unable to place counter. Please try again.");
                }
            }

            // check if the current player has won
            board.printBoard();
            win = board.checkWin(currentPlayer);

            // switch player
            isPlayer1Turn = !isPlayer1Turn;
        }
        // Display winning message
        System.out.println("Congratulations " + currentPlayer.getName() + "! You Have Won!!!");
    }

    /**
     * Displays the game instructions.
     */
    private void displayInstructions() {
        // Display game instructions
        System.out.println("Welcome to Connect 4");
        System.out.println("There are 2 players red and yellow");
        System.out.println("Player 1 is Red, Player 2 is Yellow");
        System.out.println("To play the game type in the number of the column you want to drop you counter in");
        System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally \n");
    }
}