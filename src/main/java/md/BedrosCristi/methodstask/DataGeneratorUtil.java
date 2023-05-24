package md.BedrosCristi.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima nu poate fi mai mare decit cea maxima");
            return 0;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        int numarAleator = deltaRandomInt + min;
        return numarAleator;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@gmail.com";
        return uuid + domain;

    }

    public static String generateValidRandomString(int lenght) {
        String acceptedChars = "qwertyuioplkjhgfdsazxcvbnm0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    public static String generateInvalidRandomString(int lenght) {
        String acceptedChars = "~!@#$%^&*(){}:<>";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}
