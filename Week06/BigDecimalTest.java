import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        // 2.35 - 1.95
        BigDecimal a = new BigDecimal("2.35");
        BigDecimal b = new BigDecimal("1.95");
        BigDecimal result1 = a.subtract(b);
        System.out.println("2.35 - 1.95 = " + result1);

        // 1000000.0f + 1.2f - 1000000.0f
        float c = 1000000.0f;
        float d = 1.2f;
        float e = 1000000.0f;
        BigDecimal result2 = new BigDecimal(Float.toString(c)).add(new BigDecimal(Float.toString(d))).subtract(new BigDecimal(Float.toString(e)));
        System.out.println("1000000.0f + 1.2f - 1000000.0f = " + result2);

        // 0.1 + 0.2 = 0.3
        BigDecimal f = new BigDecimal("0.1");
        BigDecimal g = new BigDecimal("0.2");
        BigDecimal expected = new BigDecimal("0.3");
        BigDecimal result3 = f.add(g);
        System.out.println("0.1 + 0.2 = " + result3 + " (Expected: " + expected + ")");
    }
}
