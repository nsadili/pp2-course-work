package assignment9.src;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("4.32");
        BigDecimal b = new BigDecimal("2.71");
        BigDecimal result1 = a.subtract(b);
        System.out.println("4.32 - 2.71 = " + result1);

        BigDecimal c = new BigDecimal("1000000.0");
        BigDecimal d = new BigDecimal("1.2");
        BigDecimal e = new BigDecimal("1000000.0");
        BigDecimal result2 = c.add(d).subtract(e);
        System.out.println("1000000.0f + 1.2f - 1000000.0f = " + result2);

        float f = 0.1f;
        BigDecimal g = new BigDecimal("0.1");
        System.out.println("f = " + f);
        System.out.println("g = " + g);
    }
}
