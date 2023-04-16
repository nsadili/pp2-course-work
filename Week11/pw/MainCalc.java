public class MainCalc {
    public static void main(String[] args) {
        
        Calculator addition = (a, b) -> a + b;

        
        double result = addition.calculate(2.0, 3.5);
        System.out.println("Result of addition: " + result); 

        Calculator subtraction = (a, b) -> a - b;
        result = subtraction.calculate(2.0, 5.0);
        System.out.println("Subtraction result: " + result);

        Calculator multiplication = (a, b) -> a * b;
        result = multiplication.calculate(2, 3.5);
        System.out.println("Multiplication result: " + result);

        Calculator division = (a, b) -> a / b;
        result = division.calculate(2, 3.5);
        System.out.println("Division result: " + result);


    }
}
