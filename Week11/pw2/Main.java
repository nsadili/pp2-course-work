package pw2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Calculate> calc = new LinkedHashMap<>();
        calc.put('+', (a, b) -> a + b);
        calc.put('-', (a, b) -> a - b);
        calc.put('*', (a, b) -> a * b);
        calc.put('/', (a, b) -> a / b);
        calc.put('^', (a, b) -> Math.pow(a, b));
        System.out.println("7 + 10 = " + calc.get('+').calculate(7, 10));
        System.out.println("7 - 10 = " + calc.get('-').calculate(7, 10));
        System.out.println("7 * 10 = " + calc.get('*').calculate(7, 10));
        System.out.println("7 / 10 = " + calc.get('/').calculate(7, 10));
        System.out.println("7 ^ 10 = " + calc.get('^').calculate(7, 10));

    }

}
