package EX;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class Ex9 {
    public static void main(String args[]) {
        BigDecimal a = BigDecimal.valueOf(2.35);
        a = a.subtract(BigDecimal.valueOf(1.95));
        BigDecimal b = BigDecimal.valueOf(1000000.0f);
        BigDecimal res2 = b.add(BigDecimal.valueOf(1.2f)).subtract(BigDecimal.valueOf(1000000.0f));
        System.out.println("2.35-1.95=" + a);
        System.out.println(res2);

    }
}
