
interface Calculator {
    double calculate(double a, double b);
  }
  
  // Implementation using lambda expressions
  public class CalculatorApp {
    public static void main(String[] args) {
      Calculator add = (a, b) -> a + b;
      Calculator subtract = (a, b) -> a - b;
      Calculator multiply = (a, b) -> a * b;
      Calculator divide = (a, b) -> a / b;
      Calculator exponentiation = (a, b) -> Math.pow(a, b);
      
      // Test the calculator
      double a = 10;
      double b = 2;
      System.out.println("Addition: " + add.calculate(a, b));
      System.out.println("Subtraction: " + subtract.calculate(a, b));
      System.out.println("Multiplication: " + multiply.calculate(a, b));
      System.out.println("Division: " + divide.calculate(a, b));
      System.out.println("Exponentiation: " + exponentiation.calculate(a, b));
    }
  }
  