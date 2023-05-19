package md.BedrosCristi.operationsandcyclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int x = 56;
        int y = 11;

        //suma
        int sum = x + y;
        System.out.println("Rezultatul sumei = " + sum);

        //scaderea
        int sub = x - y;
        System.out.println("Rezultatul scaderii = " + sub);

        //inmultirea
        int result = x * y;
        System.out.println("Rezultatul inmultirii = " + result);

        //impartirea
        result = x / y;
        System.out.println("Rezultatul impertirii = " + result);

        //restul impartirii
        result = x % y;
        System.out.println("Rezultatul restului impartitii = " + result);
    }
}