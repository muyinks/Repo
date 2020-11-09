import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Inner Class for CardGame.Ask a user for the number of players in a game. This should be a method.
 */
public class NumberOfPlayers {

    public static void main(String[] args) {
        System.out.println("Please enter the number of players: ");
        String line =  null;
        int numOfPlayers = 0;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            line = is.readLine();

            numOfPlayers = Integer.parseInt(line);
        } catch (IOException e) {
            System.err.println("Invalid input: " + e);
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number: " + line);
        }
        System.out.println("The game will have " + numOfPlayers + " players.");

    }
}
