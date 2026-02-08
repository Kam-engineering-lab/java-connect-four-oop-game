import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Class to represent the UserInput implementing the IUserInput interface.
 */
public class UserInput implements IUserInput {

    /**
     * The buffered reader input.
     */
    private BufferedReader input;

    /**
     * Initialises the UserInput.
     */
    public UserInput() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Gets the user input.
     *
     * @return The string input.
     */
    public String getUserInput() {
        String toReturn = null;
        try {
            toReturn = input.readLine();
        } catch (Exception e) {
            System.out.print(e);
        }
        return toReturn;
    }

    /**
     * Validates the given input is an integer between 1 and 7.
     *
     * @param input The input.
     * @return True if the input is valid, false otherwise.
     */
    public boolean validate(String input) {
        int move = 0;
        try {
            move = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error! Non integer input. Please input an integer value 1-7: ");
            return false;
        }

        if (move <= 7 && move > 0) {
            return true;
        } else {
            System.out.println("Error! Integer input is outbound. Please input an integer value 1-7: ");
            return false;
        }
    }
}