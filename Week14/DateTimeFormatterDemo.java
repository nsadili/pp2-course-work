import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.systemDefault());
        LocalTime  now = LocalTime.of(15, 53, 25);
        LocalDateTime dt = LocalDateTime.now();
        
        System.out.println(today);
        System.out.println(now);
        System.out.println(dt);

        LocalDate elvinsBD = LocalDate.of(2005, 5, 10);
        LocalDate elvinsBD2 = LocalDate.of(2005, Month.OCTOBER, 10);
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dtFormatter.format(elvinsBD));
        System.out.println(elvinsBD2.format(dtFormatter));
        System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss a").format(today));
    }
}
