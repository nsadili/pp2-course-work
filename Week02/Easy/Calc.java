public class Calc {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please,enter two integers");
        System.exit(1);
        

        }
System.out.println(args[0]);  
System.out.println(args[1]); 
var a = Integer.parseInt(args[0]) ;
var b = Integer.parseInt(args[1]) ;
System.out.println(a+b);


    }
}


public class Flowers {


    public void makeSound() {
       System.out.println("The animal makes a sound");
    }
 }
 
 public class Cat extends Flowers {
    public void makeSound() {
       System.out.println("Meow");
    }
 }
 
 public class Main {
    public static void main(String[] args) {
        Flowers animal = new Cat();
       animal.makeSound(); // prints "Meow"
    }
 }
 
