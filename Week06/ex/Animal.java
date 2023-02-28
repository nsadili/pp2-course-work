class Animal {
  public /*static*/ void makeSound(){
    System.out.println("Any Sound");
  }
}

class Dog extends Animal{
public /*static*/ void makeSound(){ // if we will have a static method 
                                // the output will be different
    System.out.println("Haf-haf");
}
}

class Cat extends Animal{
   public /*static*/ void makeSound(){
    System.out.println("Meow");
   }
}