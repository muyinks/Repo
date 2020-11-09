import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Op {

    public String getInputPack() {
        System.out.println("Please enter the location of the pack to load: ");
        String userInput = null;
        try {
            BufferedReader getUserInput = new BufferedReader(new InputStreamReader(System.in));
            userInput = getUserInput.readLine();
        } catch (IOException e) {
            System.out.println("Invalid: user input.");
        }
        return userInput;
    }

    public 
}