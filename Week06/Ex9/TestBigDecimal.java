package Week06.Ex9;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {
        // Test 2.35 - 1.95
        BigDecimal num1 = new BigDecimal("2.35");
        BigDecimal num2 = new BigDecimal("1.95");
        BigDecimal result1 = num1.subtract(num2);
        System.out.println("2.35 - 1.95 = " + result1);

        // Test 1000000.0f + 1.2f - 1000000.0f
        BigDecimal num3 = new BigDecimal("1000000.0");
        BigDecimal num4 = new BigDecimal("1.2");
        BigDecimal num5 = new BigDecimal("1000000.0");
        BigDecimal result2 = num3.add(num4).subtract(num5);
        System.out.println("1000000.0f + 1.2f - 1000000.0f = " + result2);
    }

}
