import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Practice{
    public static void main(String[] args) {
        var value = 6233.768;
        NumberFormat formatter = new DecimalFormat("Number: ###,###.0000");
System.out.println(formatter.format(value));
    }
}