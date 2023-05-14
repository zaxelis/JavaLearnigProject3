package md.BedrosCristi.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Garage garajul1 = new Garage("Uzinelor");
        System.out.println(" Adresa garajului1 este " + garajul1.address);
        garajul1.carCapacity = 15;
        System.out.println(" Capacitatea garajului1 este de " + garajul1.carCapacity + " masini ");

        Worker worker1 = new Worker("Bedros Cristi");
        System.out.println("Numele lucrătorului este " + worker1.name);
        worker1.isExperienced = true;
        System.out.println("Lucratorul are experienta? " + worker1.isExperienced);

        Car car1 = new Car(" Skoda", " Superb ", 2020, "Diesel");
        car1.carPrice = 25000;
        System.out.println("Marka si modelul automobilului este" + car1.make + car1.model + "Prețul de " + car1.carPrice + " euro " +
                " anul productiei: " + car1.productionYear + " si cu tipul de combustibil " + car1.fuelType);

        Tool tool1 = new Tool(false);
        tool1.uniqueCode = 232323232;
        System.out.println("Codul unic este " + tool1.uniqueCode + ", trebuie conectat la reteaua electrica?: " + tool1.needsElectricity);
    }
}