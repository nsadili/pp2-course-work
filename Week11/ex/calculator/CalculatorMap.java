package calculator;

import java.util.HashMap;
import java.util.Map;

public interface CalculatorMap {
    double calculate(double a, double b);

    Map<String, CalculatorMap> ops = new HashMap<>();

    public static void main(String[] args) {
        ops.put("calcAdd", ((a, b) -> a + b));
        ops.put("calcSub", ((a, b) -> a - b));
        ops.put("calcMult", ((a, b) -> a * b));
        ops.put("calcDiv", ((a, b) -> a / b));
        ops.put("calcExp", ((a, b) -> Math.pow(a, b)));

        System.out.println(ops.get("calcAdd").calculate(3, 5));
        System.out.println(ops.get("calcSub").calculate(5, 3));
        System.out.println(ops.get("calcMult").calculate(3, 5)); 
        System.out.println(ops.get("calcDiv").calculate(15, 3));
        System.out.println(ops.get("calcExp").calculate(2, 3));
    }

}
