package md.BedrosCristi.zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats meat");
    }

    public void makeSound() {
        System.out.println(this.getName() + " says wouf!");
    }
}
