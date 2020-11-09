import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Find the location
Inner Class for CardGame.
 */
public class GetInputPack   {

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

    /**public static void main(String args[]) {

        System.out.println("Please enter the location of pack to load : ");
        String packLocation = null;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            packLocation = is.readLine();

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        System.out.println("The file is: " + packLocation) ;

    }
     */

}

