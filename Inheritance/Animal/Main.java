package Inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";
        d.age = 3;
        Cat c = new Cat();
        c.name = "Kitty";
        c.age = 2;
        Bird b = new Bird();
        b.name = "Tweety";
        b.age = 1;
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}

