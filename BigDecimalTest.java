import java.math.BigDecimal;

public class BigDecimalTest {
    /**
     * @param args
     * @param string TODO
     */
    public static void main(String[] args, String string) {
        // 2.35 - 1.95
        BigDecimal a = new BigDecimal("2.35");
        BigDecimal b = new BigDecimal("1.95");
        BigDecimal result = a.subtract(b);
        System.out.println("2.35 - 1.95 = " + result); // expected output: 0.4

        // 1000000.0f + 1.2f - 1000000.0f
        float c = 1000000.0f;
        float d = 1.2f;
        float e = 1000000.0f;
        BigDecimal f = new BigDecimal(Float.toString(c));
        BigDecimal g = new BigDecimal(Float.toString(d));
        BigDecimal h = new BigDecimal(Float.toString(e));
        BigDecimal result2 = f.add(g).subtract(h);
        System.out.println("1000000.0f + 1.2f - 1000000.0f = " + result2); // expected output: 1.2

        // 0.1 + 0.2
        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");
        BigDecimal result3 = x.add(y);
        System.out.println("0.1 + 0.2 = " + result3); // expected output: 0.3

        // 0.1 * 0.2
        BigDecimal p = new BigDecimal("0.1");
        BigDecimal q = new BigDecimal("0.2");
        BigDecimal result4 = p.multiply(q);
        System.out.println("0.1 * 0.2 = " + result4); // expected output: 0.02

    }
}
