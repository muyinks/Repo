/**
 * A Card class has a face value and a preferred status
 */
public class Card {

    // Attributes

    private int faceValue;

    private boolean preferredStatus = false;       // True if the card is of preferred denomination

    // Methods

    public void setPreferredStatus(boolean preferredStatus) {
        this.preferredStatus = preferredStatus;
    }

    public boolean getPreferredStatus(){return this.preferredStatus;}

    // Constructor

    public Card(int faceValue, boolean preferredStatus){
        this.faceValue = faceValue;
        this.preferredStatus = preferredStatus;
    }

}
