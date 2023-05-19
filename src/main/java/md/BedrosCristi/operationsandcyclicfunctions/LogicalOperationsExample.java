package md.BedrosCristi.operationsandcyclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        boolean result = x && y;
        System.out.println("Logic and: " + result);

        //x = true
        x = result && y;
        //x = false
        System.out.println("Logic and: " + x);

        //result = false
        result = x || y;
        //result = false
        System.out.println("Logic or: " + result);

        System.out.println("Negation: " + !!!result);
    }
}