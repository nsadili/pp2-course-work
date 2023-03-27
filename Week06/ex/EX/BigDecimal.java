package EX;


public class BigDecimal {
    public static void main(String args[]) {
        BigDecimal a = BigDecimal.valueOf(2.35);
        a = a.subtract(BigDecimal.valueOf(1.95));
        BigDecimal b = BigDecimal.valueOf(1000000.0f);
        BigDecimal res2 = b.add(BigDecimal.valueOf(1.2f)).subtract(BigDecimal.valueOf(1000000.0f));
        System.out.println("2.35-1.95=" + a);
        System.out.println(res2);

    }

    private java.math.BigDecimal add(BigDecimal valueOf) {
        return null;
    }

    private BigDecimal subtract(BigDecimal valueOf) {
        return null;
    }

    private static BigDecimal valueOf(double d) {
        return null;
    }

    
}
