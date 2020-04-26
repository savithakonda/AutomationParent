package data.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        getProp("username");
    }

    public static String getProp(String key) throws FileNotFoundException {
        FileInputStream myFileInputStream = null;
        // Find the property file and create a File object in java
        File myFile = new File("C:\\123456Users\\skonda23\\IdeaProjects\\AutomationParent\\JavaBasics\\src\\main\\resources\\Config.properties");

        // since properties need Inputstream object, convert file object into inputstream object
        try {
             myFileInputStream = new FileInputStream(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Given file path is not valid");
            System.out.println("Cause: " +  e.getCause());
            System.out.println("Message: " + e.getMessage());
        }

        // Declare the file as Properties type
        Properties myProp = new Properties();
        try {
            myProp.load(myFileInputStream);
        } catch (Exception e) {
            System.out.println("Error while reading data from the property file");

        }

        // Read the expected value from the file
        return myProp.getProperty(key);


    }
}
