package md.BedrosCristi.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal bossDog = new Dog("Boss");
        System.out.println("Dog's name = " + bossDog.getName());
        bossDog.setName("Tuzik");
        System.out.println("Dog's new name = " + bossDog.getName());

        bossDog.eat();

        AnimalInterface luckyDog = new Dog("Lucky");
        luckyDog.makeSound();

        Animal barsikCat = new Cat("Barsik");
        System.out.println("Cat's name = " + barsikCat.getName());
        barsikCat.setName("Rijik");
        System.out.println("Cat's new name = " + barsikCat.getName());

        barsikCat.eat();

        AnimalInterface persicCat = new Cat("Persic");
        persicCat.makeSound();

        Animal keshaBird = new Bird("Kesha");
        System.out.println("Bird's name = " + keshaBird.getName());
        keshaBird.eat();

        AnimalInterface toshaBird = new Bird("Tosha");
        toshaBird.makeSound();

        Animal burenkaCow = new Cow("Burenka");
        System.out.println("Cow's name = " + burenkaCow.getName());
        burenkaCow.eat();

        AnimalInterface murkaCow = new Cow("Murka");
        murkaCow.makeSound();
    }
}
