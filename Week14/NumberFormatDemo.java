import java.util.text;
public class NumberFormatDemo {
    public static void main(String[] args) {
        var value = 34.4567;
        NumberFormat formatter = new DecimalFormat("##.##");
        System.out.println(formatter.format(value));
    }
}
