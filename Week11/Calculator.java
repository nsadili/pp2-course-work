import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public interface Calc {
        double calculate(double a, double b);
    }
    public static void main(String[] args) {

        Map<String, Calc> op = new HashMap<>();
        
        op.put("addition", (a, b) -> a + b);
        op.put("subtraction", (a, b) -> a - b);
        op.put("multiplication", (a, b) -> a * b);
        op.put("division", (a, b) -> a / b);
        op.put("expontation", (a, b) -> Math.pow(a, b));

        System.out.println("Add : " + op.get("addition").calculate(3, 5));
        System.out.println("Subtract: " + op.get("subtraction").calculate(9, 5));
        System.out.println("Multiply: " + op.get("multiplication").calculate(3, 5));
        System.out.println("Divide: " + op.get("division").calculate(46, 5));
        System.out.println("Expontation: " + op.get("expontation").calculate(3, 3));

    }
}
