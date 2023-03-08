import java.math.BigDecimal;

public class BigDecimalTest {
    
    public static void main(String[] args) {
        
        // 2.35 - 1.95
        BigDecimal a = new BigDecimal("2.35");
        BigDecimal b = new BigDecimal("1.95");
        BigDecimal result1 = a.subtract(b);
        System.out.println(a + " - " + b + " = " + result1);
        
        // 1000000.0f + 1.2f - 1000000.0f
        BigDecimal c = new BigDecimal("1000000.0");
        BigDecimal d = new BigDecimal("1.2");
        BigDecimal e = new BigDecimal("1000000.0");
        BigDecimal result2 = c.add(d).subtract(e);
        System.out.println(c + " + " + d + " - " + e + " = " + result2);
        
    }
}




