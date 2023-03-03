package Week05.src.TypesOfInheritance;

public class HierarchicalInheritance {
    class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }

    class Cat extends Animal {
        void meow() {
            System.out.println("Meowing...");
        }
    }
}
