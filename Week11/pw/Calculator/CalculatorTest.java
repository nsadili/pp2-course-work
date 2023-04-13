package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        
        
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator exp = (a, b) -> Math.pow(a, b);


        System.out.println("Addition: " + add.calculate(4, 9));
        System.out.println("Subtraction: " + sub.calculate(4, 9));
        System.out.println("Multiplication: " + mult.calculate(4, 9));
        System.out.println("Division: " + div.calculate(4, 9));
        System.out.println("Exponentiation: " + exp.calculate(4, 9));
    }
}
