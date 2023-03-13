import java.math.BigDecimal;

public class Example1 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.35");
        BigDecimal num2 = new BigDecimal("1.95");
        BigDecimal result = num1.subtract(num2);
        System.out.println(result); // Expected output: 0.4
    }
}
