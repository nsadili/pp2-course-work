import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {

        BigDecimal bg=BigDecimal.valueOf(2.35);
       bg= bg.subtract(BigDecimal.valueOf(1.35));
       System.out.println(bg);

      BigDecimal bg2= new BigDecimal(String.valueOf(1000000.0f));
      bg2=bg2.add(new BigDecimal(Float.toString(1.2f))).subtract(new BigDecimal(String.valueOf(1000000.0f)));
      System.out.println(bg2);
     
        
    }
}
