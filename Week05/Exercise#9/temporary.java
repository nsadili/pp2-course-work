class Animal {

    // method in the superclass
    public void eat() {
      System.out.println("I can eat");
    }
  }
  
  // Dog inherits Animal
  class Dog extends Animal {
  
    // overriding the eat() method
    @Override
    public void eat() {
  
      // call method of superclass
      super.eat();
      System.out.println("I eat dog food");
    }
  
    // new method in subclass
    public void bark() {
      System.out.println("I can bark");
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create an object of the subclass
      Dog labrador = new Dog();
  
      // call the eat() method
      labrador.eat();
      labrador.bark();
    }
  }