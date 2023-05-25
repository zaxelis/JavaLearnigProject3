package md.BedrosCristi.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats the mouse");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says meow!");
    }
}
