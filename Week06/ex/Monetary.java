import java.math.BigDecimal;
import java.math.RoundingMode;

public class Monetary {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("12.34567");
         bd = bd.setScale(2, RoundingMode.FLOOR);
        System.out.println(bd);

        BigDecimal amount = new BigDecimal("22.15");
        System.out.println(2.35 - 1.95);
        System.out.println(1000000.0f + 1.2f - 1000000.0f);


                BigDecimal bd1 = new BigDecimal("2.35");
        BigDecimal bd2 = new BigDecimal("1.95");
        BigDecimal result = bd1.subtract(bd2);
        System.out.println(result);

    }
}
