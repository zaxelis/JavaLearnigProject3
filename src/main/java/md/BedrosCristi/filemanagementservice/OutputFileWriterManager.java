package md.BedrosCristi.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {
    public static void writeDataIntoFileWithFileWriter(File file, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("There has been found an exception: " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("There has been found an exception " + e.getMessage());
                }
            }
        }
    }

    public static void writeDataIntoFileWithBufferedWriter(File file, String content) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("There is an exception " + e.getMessage());
        }
    }
}
