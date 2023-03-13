import java.math.BigDecimal;

public class Example2 {
    public static void main(String[] args) {
        float num1 = 1000000.0f;
        float num2 = 1.2f;
        float num3 = 1000000.0f;
        BigDecimal result = new BigDecimal(Float.toString(num1)).add(new BigDecimal(Float.toString(num2))).subtract(new BigDecimal(Float.toString(num3)));
        System.out.println(result); // Expected output: 1.2
    }
}
