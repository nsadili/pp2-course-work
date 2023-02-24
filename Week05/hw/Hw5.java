package Week05.hw;

public class Hw5 {
    // Single Inheritance - extends only one other class. 

    class Tree {
        // something
    }
    
    class Apple extends Tree {
        // something
    }

//     Here, Apple is a subclass of Tree.



    // Multilevel Inheritance - a class extends another class that itself extends another class.

    class University {
        // something
    }
    
    class Student extends University {
        // something
    }
    
    class IDCard extends Student {
        // something
    }

    // Here, IDCard is a subclass of Student, which is a subclass of University.



    // Hierarchical Inheritance - multiple classes extend a single class.

    class Clothing {
        // somehting
    }
    
    class Pullower extends Clothing {
        // somehting
    }
    
    class Tie extends Clothing {
        // somehting
    }

    // Here, both Pullower and Tie are subclasses of Clothing.



    // Multiple Inheritance - a class extends two or more classes at the same time.

    class A {
        // something
    }
    
    class B {
        // something
    }
    
    class C extends A, B {
        // something
    }

    // Here, C extends both A and B.



    // Hybrid Inheritance - combination of two or more types of inheritance.

    class Animal {
        // something
    }
    
    class Mammal extends Animal {
        // something
    }
    
    class Bird extends Animal {
        // something
    }
    
    class Bat extends Mammal implements Flying {
        // something
    }

    // Here, Bat is a subclass of Mammal, which is a subclass of Animal. Additionally, Bat implements the Flying interface


 }
