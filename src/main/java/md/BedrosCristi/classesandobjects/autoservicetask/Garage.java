package md.BedrosCristi.classesandobjects.autoservicetask;

public class Garage {

    String address;

    boolean hasComputerDiagnostics;

    int carCapacity;

    String numberId;

    String scheduler;

    Garage(String address) {
        this.address = address;
        System.out.println("A fost creat garajul");
    }

    Garage(int carCapacity) {
        this.carCapacity = carCapacity;
        System.out.println("A fost creat un instrument pentru a afla capacitatea garajului");

    }
}