import java.math.BigDecimal;

public class BigDecimal {
    
    public BigDecimal(String string) {
    

BigDecimal num1 = new BigDecimal("2.35");
BigDecimal num2 = new BigDecimal("1.95");

BigDecimal substract= num1.subtract(num2);
System.out.println(result); // Output: 0.4


BigDecimal num3 = new BigDecimal("1000000.0");
BigDecimal num4 = new BigDecimal("1.2");
BigDecimal num5 = new BigDecimal("1000000.0");

BigDecimal result = num1.add(num4).subtract(num5);

System.out.println(result); // Output: 1.2

    }
}