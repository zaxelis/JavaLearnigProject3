package md.BedrosCristi.zooclubservice;

public class Cow extends Animal implements AnimalInterface {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats grass");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says muu!");
    }
}
