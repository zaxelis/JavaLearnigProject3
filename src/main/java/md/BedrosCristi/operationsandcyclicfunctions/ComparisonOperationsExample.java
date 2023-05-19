package md.BedrosCristi.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int x = 30;
        int y = 3;

        //egal cu
        boolean isEqual = x == y;
        System.out.println("x egal cu y = " + isEqual);

        //diferit de
        boolean isNotEqual = x != y;
        System.out.println("x diferit de y = " + isNotEqual);

        //mai mare decit
        boolean isGreaterThan = x > y;
        System.out.println("x este mai mare decit y = " + isGreaterThan);

        //mai mic decit
        boolean isLessThan = x < y;
        System.out.println("x este mai mic decit y = " + isLessThan);

        //mai mare sau egal cu
        boolean isGreaterThanOrEqual = x >= y;
        System.out.println("x este mai mare sau egal cu y = " + isGreaterThanOrEqual);

        //mai mic sau egal cu
        boolean isLessThanOrEqual = x <= y;
        System.out.println("x este mai mic sau egal cu y = " + isLessThanOrEqual);
    }
}