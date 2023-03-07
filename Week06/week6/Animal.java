package week6;



abstract class Animal {
    public abstract void makeSound();
}
 class Dog extends Animal{
    public boolean  isTrainable(){
        return true; 
    }

    public void makeSound(){
        System.out.println("Huf-huf");
    }
} 
