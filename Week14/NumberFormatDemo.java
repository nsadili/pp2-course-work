import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class NumberFormatDemo {
    public static void main(String[] args) {

        var value=4123.4567;
        NumberFormat f1 = new DecimalFormat("###,###.0");
        System.out.println(f1.format(value));

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
