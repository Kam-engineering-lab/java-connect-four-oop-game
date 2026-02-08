/**
 * Class for a HumanPlayer
 */
public class HumanPlayer extends Player {

    /**
     * The input source.
     */
    private UserInput input;

    /**
     * Initialises a HumanPlayer
     * @param name The player's name.
     * @param colour The player's colour.
     */
    public HumanPlayer(String name, char colour) {
        super(name, colour); // reuse code of inherited constructor method
        input = new UserInput();
    }

    /**
     * Gets the position of the player's current move from the user input.
     * @return The position of the player's current move.
     */
    public int getMove() {
        String userInput = "";
        boolean valid = false;
        while (!valid) {
            userInput = input.getUserInput();
            valid = input.validate(userInput);
        }
        return Integer.parseInt(userInput);
    }
}
