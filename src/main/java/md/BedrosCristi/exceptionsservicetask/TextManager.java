package md.BedrosCristi.exceptionsservicetask;

public class TextManager {
    public static int getTheLenght(String inputString) {
        return inputString.length();
    }

    public static int getTheLenghtWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (Exception capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following msg: " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed regardless of whether any exception has been caught or not.");
        }

    }
}
