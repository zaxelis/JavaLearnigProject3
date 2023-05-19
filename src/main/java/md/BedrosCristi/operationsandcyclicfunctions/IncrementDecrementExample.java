package md.BedrosCristi.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 40;

        //incrementare
        x++;
        System.out.println("Valoarea dupa incrementare = " + x);

        //incrementare pre-fixata
        ++x;
        int y = ++x;
        int x1 = x;
        int c = x++;
        System.out.println("Valoarea dupa incrementarea pre-fixata = " + x);
        System.out.println("Afiseaza y=" + y + " x1=" + x1 + " c=" + c);

        //decrementare
        x--;
        System.out.println("Valoarea dupa decrementare = " + x);

        //decrementarea pre-fixata
        --x;
        System.out.println("Valoarea dupa decrementarea pre-fixata = " + x);
    }
}