package Week05.src.TypesOfInheritance;

public class MultilevelInheritance {
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

    class Bulldog extends Dog {
        void guard() {
            System.out.println("Guarding...");
        }
    }

}
