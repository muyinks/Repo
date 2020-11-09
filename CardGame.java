
/*
A simple CardGame class whose main method requests via the command line the number of players in a game n
and on receiving this, the location of a valid input pack.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CardGame {

    public CardGame(){}


    public static void main(String args[]) {
        CardGame aGame = new CardGame();
        int numOfPlayers = aGame.getNumberOfPlayers();
        String packLocation = aGame.getInputPack();
    }

    /**
     * Method to request number of players.
     */
    public int getNumberOfPlayers(){
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
            getNumberOfPlayers();
        }
        return numOfPlayers;
    }

    /**
     * Method to request location of input pack.
     */
    public String getInputPack(){
        System.out.println("Please enter the location of pack to load : ");
        String packLocation = null;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            packLocation = is.readLine();

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return packLocation;

    }

    /**
     * Method to open text file.
     */

    /**
     * Method to create pack of 8n cards
     */
    LinkedList<Card> pack = new LinkedList<>();

    /**
     * Method to distribute cards to deck
     */

    /**
     * Method to distribute remain cards in pack to decks
     */


}
