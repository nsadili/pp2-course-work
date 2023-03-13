import java.math.BigDecimal;

public class Problem9 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(2.35 - 1.95);
        BigDecimal b = new BigDecimal(1000000.0f + 1.2f - 1000000.0f);

        System.out.println("BigDecimal:");
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        System.out.println("Oldschool System.out.println()");
        System.out.println(2.35 - 1.95);
        System.out.println(1000000.0f + 1.2f - 1000000.0f);
    }
}
