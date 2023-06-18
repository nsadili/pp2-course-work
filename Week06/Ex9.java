package Week06;

import java.math.BigDecimal;

public class Ex9 {
    
    class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.35");
        BigDecimal num2 = new BigDecimal("1.95");
        BigDecimal result = num1.subtract(num2);
        System.out.println(result);


        BigDecimal num3 = new BigDecimal("1000000.0");
        BigDecimal num4 = new BigDecimal("1.2");
        BigDecimal num5 = new BigDecimal("1000000.0");
        BigDecimal result1 = num3.add(num4).subtract(num5);
        System.out.println(result1);
    }
}

}

