package md.BedrosCristi.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //    createTheFileIdItDoesNotExist(File file).
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("the file does not exist, it has to be created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }
    }

    //    informIfTheTheFileExists(File file).
    public static void informIfExist(File file) {
        if (file.exists()) {
            System.out.println("The file already exist");
        } else System.out.println("The file does not exist");
    }

    //    printTheFileName(File file).
    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    //    printTheFileAbsolutePath(File file).
    public static void printTheAbsolutePath(File file) {
        System.out.println("The file absolute path is: " + file.getAbsolutePath());
    }

    //    printIfTheFileIsADirectory(File file).
    public static void prinIfTheFIleIsADirectory(File file) {
        if (file.isDirectory()) {
            System.out.println("This is a directory");
        } else System.out.println("This is not a directory");
    }

    //    deleteTheFileIfExists(File file).
    public static void deleteIfExist(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("The file was deleted");
            } else System.out.println("The file can not be deleted");
        } else System.out.println("The file does not exist");
    }
}
