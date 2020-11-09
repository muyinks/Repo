import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Open {


    public Open(){}

    /**
     * A method that requests the location of a file.
     * @return A string with location of file
     */
    public String getInputPack(){
        System.out.println("Please enter the location of pack to load : ");
        String inputLine = null;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            inputLine = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        // System.out.println("The file is at: " + inputLine);
        return inputLine;

    }

    /**
     * Check is valid. i.e. it exists, is a text file, each row is a non negative integer, and has 8n rows.
     *
     */
    public void checkFileExists(String inputLine) {
        //String inputLine = getInputPack();
        Path packLocation = Paths.get(inputLine);

        if (Files.exists(packLocation)) {
            System.out.println("File found: This file exists");
        }

        else {
            System.out.println("Not a valid file. Try again :: Check file");
            //getInputPack();
        }
    }

    /**
     *
     * Check if file is text file
     *
     */
    public void isTextFile(String inputLine){
        //String inputLine = getInputPack();
        if (inputLine.contains("txt")){
            System.out.println("This is a valid text file");
        } else {
            System.out.println("This is not a valid text file. Try again");
            getInputPack();
        }

    }

    /**
     * A method to open a valid file and add each line to arraylist
     * @param inputLine
     */

    public ArrayList<String> actuallyOpenFile(String inputLine) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputLine));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        //System.out.println(list);
        return list;
    }

    /**
     * Convert the list of Strings to array
     */

    public List<Integer> isValidInt(ArrayList<String> stringArrayList){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String line : stringArrayList) {
            try {
                //Convert String to Integer,
                int stringToInt = Integer.parseInt(line);
                if (stringToInt > 0){
                    // store it into the integer array list
                    integerArrayList.add(stringToInt);
                } else {
                    System.out.println("Not all entries are positive.");
                    break;
                }

            } catch (NumberFormatException nfe) {
                // Not all the entries are integers
                System.out.println("Not all the entries are integers");
            }
        }
        System.out.println(integerArrayList);
        System.out.printf("This list has: %d items \n",integerArrayList.size());
        return integerArrayList;
    }

    public static void main(String args[]){
        // Create open object
        Open open = new Open();

        // Request input pack name from user
        String inputLine = open.getInputPack();

        // Check that file exists
        open.checkFileExists(inputLine);

        // Check that it is a plain text file
        open.isTextFile(inputLine);

        // Open the file and return an array list of string
        ArrayList<String> stringArray = open.actuallyOpenFile(inputLine);

        // Convert String arrayList to Integer arrayList
        open.isValidInt(stringArray);



    }


}
