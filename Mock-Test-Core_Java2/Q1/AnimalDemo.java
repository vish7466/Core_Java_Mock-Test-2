class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog sound: Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat sound: Meow!");
    }
}

class Cow extends Animal {
    public void makeSound() {
        System.out.println("Cow sound: Moo!");
    }
}

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
