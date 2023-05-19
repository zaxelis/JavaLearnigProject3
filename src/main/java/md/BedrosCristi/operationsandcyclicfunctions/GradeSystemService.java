package md.BedrosCristi.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 3;

        if (testResult == 5) {
            System.out.println("Locul I");
        } else if (testResult == 4) {
            System.out.println("Locul II");
        } else if (testResult == 3) {
            System.out.println("Locul III");
        } else if (testResult == 2) {
            System.out.println("Locul IV");
        } else {
            System.out.println("Rezultatul introdus nu exista");
        }

        System.out.println("Programul s-a finisat");
    }
}