package md.BedrosCristi.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result = ArithmeticOperationService.divideIntExceptionHandling(15, 0);
        System.out.println(result);
        System.out.println("The program is running till the end");

        String stringValue = "aceasta este o valoarea";
        String stringValue2 = null;
        System.out.println(TextManager.getTheLenghtWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheLenght(stringValue));

        String filePath = "src/main/java/md/BedrosCristi/exceptionsservicetask/fisier";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
        System.out.println("The program is running");

    }
}
