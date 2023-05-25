package md.BedrosCristi.zooclubservice;

public class Bird extends Animal implements AnimalInterface {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats moskitos");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says cip!");
    }
}
