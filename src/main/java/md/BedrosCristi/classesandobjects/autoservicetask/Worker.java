package md.BedrosCristi.classesandobjects.autoservicetask;

public class Worker {

    String name;

    int age;

    String specialization;

    String sexType;

    boolean isExperienced;

    Worker(String name) {
        this.name = name;
        System.out.println("A fost creat un instrument pentru a afla numele lucratorului");

    }

    Worker(boolean isExperienced) {
        this.isExperienced = isExperienced;
        System.out.println("A fost creat un instrument pentru a afla daca lucratorul are experienta sau nu");

    }

}
