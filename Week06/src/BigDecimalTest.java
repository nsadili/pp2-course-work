import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("2.35");
        BigDecimal b = new BigDecimal("1.95");
        BigDecimal resultA = a.subtract(b);
        System.out.println(resultA);

        BigDecimal c = new BigDecimal("1000000.0");
        BigDecimal d = new BigDecimal("1.2");
        BigDecimal e = new BigDecimal("1000000.0");
        BigDecimal resultB = c.add(d).subtract(e);
        System.out.println(resultB);

    }
}
