import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A Player has a hand (with 4 cards) and index
 */
public class Player {

    // Attributes

    private int index;

    // Array of Card objects for Hand [4 elements]
    Card[] Hand = new Card[3];


    // Methods

    /**
     * drawCard and discardCard are one atomic action.
     */

    //public Card drawCard(){return card;}

    public void discardCard(){}


    // Constructor

    public Player() {

    }


}