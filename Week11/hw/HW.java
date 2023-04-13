package hw;

import java.util.function.Function;

public class HW {
    public static void main(String[] args) {
        String input = "Salam";
        Function<String, String> reverseStr = (String str) -> new StringBuilder(str).reverse().toString();
        String reversedStr = reverseStr.apply(input);
        System.out.println("Input string: " + input);
        System.out.println("Reversed string: " + reversedStr);

        int num = 3423;
        Function<Integer, Integer> count = (Integer n) -> String.valueOf(n).length();
        int numDigits = count.apply(num);
        System.out.println("Number: " + num);
        System.out.println("Number of digits: " + numDigits);

    }
}
