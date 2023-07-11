public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound(); // Output: Animal sound
        dog.makeSound();    // Output: Dog sound: Woof!
        cat.makeSound();    // Output: Cat sound: Meow!
        cow.makeSound();    // Output: Cow sound: Moo!
    }
}
