import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatDemo{
    public static void main(String[] args) {
        
        var value=334.4562;

        NumberFormat f= new DecimalFormat("000,000.0");

        System.out.println(f.format(value));
    }




}