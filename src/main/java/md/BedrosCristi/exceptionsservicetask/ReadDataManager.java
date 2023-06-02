package md.BedrosCristi.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataManager {
    public static String readDataFromFileWithoutTryAndCatch(String filePath) throws IOException {
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        return reader.toString();
    }

    public static String readDataFromFileWithTryAndCatch(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            return reader.toString();
        } catch (IOException exception) {
            System.out.println("An error has occurred: " + exception.getMessage());
            return "";
        }


    }
}


