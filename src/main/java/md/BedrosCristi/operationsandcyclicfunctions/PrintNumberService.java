package md.BedrosCristi.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int x = 450;
        int limit = 450;
        while (x > 0) {
            System.out.println(x + ", ");
            //x = x - 1
            //x -= 1;
            x--;
        }

        //valoarea lui x dupoa ce iesa din ciclul while este 0

        System.out.println();
        do {
            System.out.println(x + ", ");
            //x = x + 1;
            x++;
        } while (x < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i + ", ");
        }

        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + ", ");
            } else {
                System.out.println("[], ");
            }
        }
    }
}