import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataTimeDemo {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate jalasBD = LocalDate.of(2004, 3, 31);
        LocalDate jalasBD2 = LocalDate.of(2004, Month.MARCH, 31);

        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        // System.out.println(today);
        // System.out.println(jalasBD);
        // System.out.println(jalasBD);

        // System.out.println(now);
        // System.out.println(dt);

        DateTimeFormatter dtFrommater = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dtOurs = DateTimeFormatter.ofPattern("dd/MMM/yyyy");


        // System.out.println(dtFrommater.format(jalasBD));
        // System.out.println(dtOurs.format(today));

        DateTimeFormatter dt12Hours = DateTimeFormatter.ofPattern("hh:mm a");
        // System.out.println(now);

        System.out.println(dt12Hours.format(now));
        System.out.println(now.format(dt12Hours));

    }
}
