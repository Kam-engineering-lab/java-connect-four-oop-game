/**
 * Abstraction of class to represent a player. Each player hds 2 private properties - a colour and a name with accessor
 * methods to support the OOP principle of encapsulation.
 */
public abstract class Player{

    /**
     * The player's colour.
     */
    private char colour;

    /**
     * The player's name.
     */
    private String name;

    /**
     * Initialises a player.
     * @param name The player name.
     * @param colour The player colour.
     */
    public Player(String name, char colour){
        this.name = name;
        this.colour = colour;
    }

    /**
     * Gets the player's colour.
     * @return The player's colour.
     */
    public char getColour() {
        return colour;
    }

    /**
     * Gets the player's name.
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the position of the player's current move.
     * @return The position of the player's current move.
     */
    public abstract int getMove();
}
