class Animal {
    public static void makeSound() {
        System.out.println("Any Sound");
        }
}

class Dog extends Animal {
    public static void makeSound() {
        System.out.println("Haf-haf");
        }
}

class Cat extends Animal {
    public static void makeSound() {
    System.out.println("Meow");
    }
}

public class Ani {
    public static void main(String args[]) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Dog.makeSound();
        a2.makeSound();
    }
}