public class Exercise_3 {

        public static void main(String[] args) {
            
            // Implementations using lambda expressions
            Calculator addition = (a, b) -> a + b;
            Calculator subtraction = (a, b) -> a - b;
            Calculator multiplication = (a, b) -> a * b;
            Calculator division = (a, b) -> a / b;
            Calculator exponentiation = (a, b) -> Math.pow(a, b);
    
            // Test the implementations
            double result = addition.calculate(3, 4);
            System.out.println("3 + 4 = " + result);
    
            result = subtraction.calculate(5, 2);
            System.out.println("5 - 2 = " + result);
    
            result = multiplication.calculate(6, 8);
            System.out.println("6 * 8 = " + result);
    
            result = division.calculate(10, 2);
            System.out.println("10 / 2 = " + result);
    
            result = exponentiation.calculate(2, 3);
            System.out.println("2 ^ 3 = " + result);
        }
    
        @FunctionalInterface
        public interface Calculator {
            double calculate(double a, double b);
        }
    }
      

