package md.BedrosCristi.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int x = 32;
        int y = 5;

        //atribuirea simpla;
        int result = x;
        System.out.println("Atribuirea simpla = " + result);

        //atribuirea cu adunare
        result += y;
        System.out.println("Atribuirea cu adunare = " + result);

        //atribuirea cu scadere
        result -= y;
        System.out.println("Atribuirea cu scadere = " + result);

        //atribuirea cu inmultire
        result *= x;
        System.out.println("Atribuirea cu inmultire = " + result);

        //atribuirea cu impartire
        result /= y;
        System.out.println("Atribuirea cu impartire = " + result);

        //atribuirea cu restul impartirii
        result %= x;
        System.out.println("Atribuirea cu restul impartirii = " + result);
    }
}