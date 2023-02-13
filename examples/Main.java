package examples;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car(2015, 5000.0, "BMW");
        Car c2 = new Car(2003, 6300.0, "Mercedes");
        
        c1.getModel("Porcsh");

        System.out.println(c1);
        System.out.println(c2);

        
    }
    
}