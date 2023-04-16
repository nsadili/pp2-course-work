package Week11.ex3;

import java.util.*;

public class CalculatorDemo {
    public static void main(String[] args) {
        Map<String, Calculator> calcs = new HashMap<>();
        calcs.put("+", (a, b) -> a + b);
        calcs.put("-", (a, b) -> a - b);
        calcs.put("*", (a, b) -> a * b);
        calcs.put("/", (a, b) -> a / b);
        calcs.put("^", Math::pow);
        System.out.println(calcs.get("+").calculate(9.11, 5.4));
        System.out.println(calcs.get("-").calculate(0.9977, 3.1415));
        System.out.println(calcs.get("*").calculate(7.801, 2.09));
        System.out.println(calcs.get("/").calculate(-2.3, -0.001));
        System.out.println(calcs.get("^").calculate(4.39, 3.44));
    }
}
