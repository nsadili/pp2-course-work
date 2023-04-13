package ex3;

public class Main {
    public static void main(String[] args) {
        int x=5, y=2;
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: "+add.calculate(x,y)); 
        
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: "+subtract.calculate(x,y)); 

        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: "+multiply.calculate(x,y)); 
        
        Calculator divide = (a, b) -> a / b;
        System.out.println("Division: "+divide.calculate(x,y)); 
        
        Calculator power = (a, b) -> Math.pow(a, b);
        System.out.println("Power: "+power.calculate(x, y));
    }
}
