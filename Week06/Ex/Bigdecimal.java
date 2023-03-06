package Week06.Ex;

import java.math.BigDecimal;

public class Bigdecimal {
    public static void main(String[] args) {
        // Calculation 1: 1000000.0f + 1.2f - 1000000.0f
        BigDecimal num1 = new BigDecimal("1000000.0");
        BigDecimal num2 = new BigDecimal("1.2");
        BigDecimal res1 = num1.add(num2).subtract(num1);
        System.out.println("Calculation 1: " + res1);

        // Calculation 2: 2.35 - 1.95
        BigDecimal num3 = new BigDecimal("2.35");
        BigDecimal num4 = new BigDecimal("1.95");
        BigDecimal res2 = num3.subtract(num4);
        System.out.println("Calculation 2: " + res2);
    }


}