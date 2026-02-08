import java.util.Random;

/**
 * Class for a computer player extending the player abstract class.
 */
public class ComputerPlayer extends Player {

    Random random = new Random();

    /**
     * Initialises a ComputerPlayer.
     * @param name The player's name.
     * @param colour The player's colour.
     */
    public ComputerPlayer(String name, char colour) {
        super(name, colour); // reuse code of inherited constructor method
    }

    /**
     * Gets the position of the player's current move by randomly generating the position.
     * @return The position of the player's current move.
     */
    public int getMove() {
        var position = random.nextInt(1, 7);
        return position;
    }
}