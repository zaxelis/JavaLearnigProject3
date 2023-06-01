package md.BedrosCristi.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File numeDeFile = new File("C:\\Users\\user\\IdeaProjects\\JavaLearnigProject3\\src\\main\\java\\md\\BedrosCristi\\filemanagementservice\\fisier.txt");

        FileManager.createTheFileIfItDoesNotExist(numeDeFile);
        FileManager.informIfExist(numeDeFile);
        FileManager.prinIfTheFIleIsADirectory(numeDeFile);
        FileManager.printTheFileName(numeDeFile);
        FileManager.printTheAbsolutePath(numeDeFile);
        // FileManager.deleteIfExist(numeDeFile);

        InputFileReadManager.readDataFromTextFile(numeDeFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(numeDeFile);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(numeDeFile);

        String contentForTheFile = "Continut nou adaugat \n din rind nou";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(numeDeFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(numeDeFile, "empty");
    }
}
